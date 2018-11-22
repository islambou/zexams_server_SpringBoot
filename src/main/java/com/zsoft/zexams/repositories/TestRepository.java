package com.zsoft.zexams.repositories;

import com.zsoft.zexams.modules.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TestRepository extends CrudRepository<Test, String> {

}
