package com.zsoft.zexams.repositories;

import com.zsoft.zexams.modules.Question;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends CrudRepository<Question, String> {

    @Query("{ 'category' : ?0}")
    public List<Question> findByCategory(String category);

    public List<Question> findAllByIdIn(List<String> IDs);

    List<Question> findAllByCategory(String category);

}
