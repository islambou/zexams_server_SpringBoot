package com.zsoft.zexams.controllers;


import com.zsoft.zexams.modules.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.security.Principal;

@RestController
public class UserController {

    Authentication auth = SecurityContextHolder.getContext().getAuthentication();

    @RequestMapping("grantAccess")
    String sendSignedUser() {

        System.out.println(auth);
        return "hello";
    }

    @RequestMapping("unAuth")
    String sendUnAuthMessage() {
        return "credentials are wrong";
    }
}



