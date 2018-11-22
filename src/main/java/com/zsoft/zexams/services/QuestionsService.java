package com.zsoft.zexams.services;

import com.zsoft.zexams.modules.Question;
import com.zsoft.zexams.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuestionsService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAll() {
        List<Question> result = new ArrayList<Question>();
        questionRepository.findAll().forEach(result::add);

        return result;
    }

    public List<Question> getByCategory(String category) {
        List<Question> result = new ArrayList<Question>();
        questionRepository.findByCategory(category).forEach((result::add));

        return result;
    }

    public Question getById(String id) {
        return questionRepository.findById(id).get();
    }

    public Question insert(Question question) {
        return questionRepository.save(question);
    }

    public List<Question> getByIds(ArrayList<String> IDs) {
        return questionRepository.findAllByIdIn(IDs);
    }

    public Set<String> getCategories() {
        Set<String> categories = new HashSet<String>();
        questionRepository.findAll().forEach(el -> {
            categories.add((el.getCategory()));
        });

        return categories;
    }

    public ArrayList<String> deleteQuestion(ArrayList<String> ids) {
        ArrayList<String> deleted = new ArrayList<>();
        ids.forEach(id -> {
            questionRepository.deleteById(id);
            deleted.add(id);
        });
        return deleted;
    }
}
