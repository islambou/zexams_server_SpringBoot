package com.zsoft.zexams.controllers;


import com.zsoft.zexams.services.UserService;
import com.zsoft.zexams.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

class SuccessLoginResponse {
    public String username;
    public String id;
    public Object auth;

    public SuccessLoginResponse(String id, String u, Object a) {
        this.id = id;
        this.username = u;
        this.auth = a;
    }

    @Override
    public String toString() {
        return '{' +
                "'id':" + username +
                "'username':" + username +
                ", 'auth':" + auth +
                '}';
    }
}


@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("grantAccess")
    SuccessLoginResponse sendSignedUser() {
        return new SuccessLoginResponse(
                userService.findByUsername(SecurityUtils.getCurrentUserLogin().get()).getId(),
                SecurityUtils.getCurrentUserLogin().get(),
                SecurityUtils.getCurrentUserRoles().get()
        );
    }

    @RequestMapping("unAuth")
    @ResponseStatus(code = HttpStatus.UNAUTHORIZED)
    String sendUnAuthMessage() {
        return "credentials are wrong";
    }
}



