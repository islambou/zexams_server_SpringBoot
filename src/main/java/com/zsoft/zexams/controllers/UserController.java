package com.zsoft.zexams.controllers;


import com.zsoft.zexams.modules.SuccessLoginResponse;
import com.zsoft.zexams.services.UserService;
import com.zsoft.zexams.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("grantAccess")
    SuccessLoginResponse sendSignedUser() {
        SuccessLoginResponse response = new SuccessLoginResponse();

        response.setAuth(SecurityUtils.getCurrentUserRoles().get());
        response.setId(userService.findByUsername(SecurityUtils.getCurrentUserLogin().get()).getId());
        response.setUsername(SecurityUtils.getCurrentUserLogin().get());

        return response;
    }

    @RequestMapping("unAuth")
    @ResponseStatus(code = HttpStatus.UNAUTHORIZED)
    String sendUnAuthMessage() {
        return "credentials are wrong";
    }


}



