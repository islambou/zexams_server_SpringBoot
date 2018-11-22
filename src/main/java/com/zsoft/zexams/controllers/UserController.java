package com.zsoft.zexams.controllers;


import com.zsoft.zexams.modules.UserCreds;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    String postUserCreds(@RequestBody UserCreds creds) {
        System.out.println("trying to login");

        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(creds.getUsername(), creds.getPassword());

        System.out.println(authenticationToken.getPrincipal().toString());

        return "d";
    }


}
