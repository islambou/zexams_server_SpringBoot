package com.zsoft.zexams.repositories;

import com.zsoft.zexams.modules.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Dictionary;


@Repository
public interface UserRepository extends CrudRepository<User, String> {

    User findByUsername(String username);
}
