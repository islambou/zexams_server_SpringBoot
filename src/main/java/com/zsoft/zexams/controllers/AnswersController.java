package com.zsoft.zexams.controllers;

import com.zsoft.zexams.modules.UserTestAnswers;
import com.zsoft.zexams.services.UserTestAnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnswersController {
    @Autowired
    private UserTestAnswersService userTestAnswersService;

    @RequestMapping(value = "/user_answers", method = RequestMethod.POST)
    Double postUserAnswers(@RequestBody UserTestAnswers answers) {
        UserTestAnswers inserted = userTestAnswersService.insert(answers);
        userTestAnswersService.testAnswersMark(inserted.getId());
        return userTestAnswersService.testAnswersMark(inserted.getId());
    }

}
