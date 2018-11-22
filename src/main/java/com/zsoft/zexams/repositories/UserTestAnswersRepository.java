package com.zsoft.zexams.repositories;

import com.zsoft.zexams.modules.UserTestAnswers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserTestAnswersRepository extends CrudRepository<UserTestAnswers, String> {


}
