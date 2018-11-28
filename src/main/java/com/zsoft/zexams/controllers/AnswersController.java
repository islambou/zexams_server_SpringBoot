package com.zsoft.zexams.controllers;

import com.zsoft.zexams.modules.Test;
import com.zsoft.zexams.modules.UserTestAnswers;
import com.zsoft.zexams.repositories.TestRepository;
import com.zsoft.zexams.services.TestsService;
import com.zsoft.zexams.services.UserTestAnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AnswersController {
    @Autowired
    private UserTestAnswersService userTestAnswersService;

    @Autowired
    private TestRepository testRepository;


    @RequestMapping(value = "/user_answers", method = RequestMethod.POST)
    Double postUserAnswers(@RequestBody UserTestAnswers answers) {
        System.out.println("inserting : " + answers);
        double mark = userTestAnswersService.testAnswersMark(answers);
        answers.setMark(mark);
        UserTestAnswers inserted = userTestAnswersService.insert(answers);
        System.out.println("inserted : " + inserted);

        userTestAnswersService.testAnswersMark(inserted.getId());
        return mark;
    }

    @GetMapping("/user_answers/user/{id}")
    ArrayList<UserTestAnswers> getAllUserTests(@PathVariable String id) {
        // userTestAnswersService.
        return userTestAnswersService.findUserTests(id);
    }


    @GetMapping("/user_answers/user/withtitles/{id}")
    ArrayList<UserTestAnswers> getAllUserTestsWithTitles(@PathVariable String id) {
        ArrayList<UserTestAnswers> userTestAnswers = userTestAnswersService.findUserTests(id);


        userTestAnswers.forEach(e -> {
            Test test = testRepository.findById(e.getTest()).get();
            System.out.println(e.getId());
            String testTitle = test.getTest();

            e.setTest(testTitle);
        });
        return userTestAnswers;
    }
}
