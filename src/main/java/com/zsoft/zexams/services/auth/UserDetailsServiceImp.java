package com.zsoft.zexams.services.auth;

import com.zsoft.zexams.modules.User;
import com.zsoft.zexams.modules.UserRole;
import com.zsoft.zexams.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class UserDetailsServiceImp implements UserDetailsService {
    @Autowired
    UserService userService;

    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userService.findByUsername(username);
        System.out.println("load user by username : " + user);
        System.out.println("load user by username : " + user);

        ArrayList<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (UserRole role : user.getRoles()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getId()));
        }
        System.out.println("imp called");
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
        System.out.println(userDetails);
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }
}
