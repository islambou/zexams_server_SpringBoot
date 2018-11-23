package com.zsoft.zexams.services;

import com.zsoft.zexams.modules.User;
import com.zsoft.zexams.modules.UserRole;
import com.zsoft.zexams.repositories.RoleRepository;
import com.zsoft.zexams.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    public ArrayList<User> getAll() {
        ArrayList<User> result = new ArrayList<User>();
        userRepository.findAll().forEach(result::add);

        return result;
    }

    public User findById(String id) {
        return userRepository.findById(id).get();
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }


    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<UserRole>((Collection<? extends UserRole>) roleRepository.findById("ADMIN_Role").get()));
        userRepository.save(user);
    }

    public User updateUser(User user) {

        return userRepository.save(user);
    }


    //--------------------------------------------------------//


}
