package com.zsoft.zexams.controllers;

import com.zsoft.zexams.modules.Question;
import com.zsoft.zexams.modules.UserTestAnswers;
import com.zsoft.zexams.services.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
public class QuestionsController {
    @Autowired
    private QuestionsService questionService;

    @RequestMapping("/questions")
    List<Question> getAll() {
        return questionService.getAll();
    }

    @RequestMapping(value = "/questions", method = RequestMethod.POST)
    Question postQuestion(@RequestBody Question question) {
        return questionService.insert(question);
    }

    @RequestMapping("/questions/categories/{category}")
    List<Question> getByCategory(@PathVariable String category) {
        return questionService.getByCategory(category);
    }


    @RequestMapping("/questions/{id}")
    Question getById(@PathVariable String id) {
        return questionService.getById(id);
    }

    @RequestMapping(value = "/questions", method = RequestMethod.DELETE)
    ArrayList<String> deleteQuestion(@RequestBody ArrayList<String> ids) {
        return questionService.deleteQuestion(ids);
    }


    @RequestMapping("/questions/categories")
    Set<String> getCategories() {

        return questionService.getCategories();
    }

}
