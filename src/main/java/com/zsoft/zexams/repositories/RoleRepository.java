package com.zsoft.zexams.repositories;

import com.zsoft.zexams.modules.UserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<UserRole, String> {
    List<UserRole> findAll();

    Optional<UserRole> findById(String id);

}
