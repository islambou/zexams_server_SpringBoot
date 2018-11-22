package com.zsoft.zexams.services;

import com.zsoft.zexams.modules.*;
import com.zsoft.zexams.repositories.TestRepository;
import com.zsoft.zexams.repositories.UserTestAnswersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class UserTestAnswersService {

    @Autowired
    private UserTestAnswersRepository testAnswersRepository;

    @Autowired
    private TestsService testsService;

    @Autowired
    private QuestionsService questionsService;

    public List<UserTestAnswers> getAll() {
        List<UserTestAnswers> result = new ArrayList<UserTestAnswers>();
        testAnswersRepository.findAll().forEach(result::add);

        return result;
    }

    public UserTestAnswers findById(String id) {
        return testAnswersRepository.findById(id).get();

    }

    public UserTestAnswers insert(UserTestAnswers uts) {
        return testAnswersRepository.save(uts);
    }

    public double testAnswersMark(String userTestAnswersId) {

        UserTestAnswers userTestAnswers = testAnswersRepository.findById(userTestAnswersId).get();
        Test test = testsService.findById(userTestAnswers.getTest());

        List<Question> testQuestions = questionsService.getByIds(test.getQuestions());

        ArrayList<UserQuestionAnswer> userAnswers = userTestAnswers.getAnswers();

        ArrayList<UserQuestionAnswer> goodAnswers = new ArrayList<>();

        testQuestions.forEach(ques -> {
            AtomicInteger index = new AtomicInteger();
            UserQuestionAnswer uqs = new UserQuestionAnswer();
            uqs.setQuestion(ques.getId());

            ques.getAnswers().forEach(ans -> {

                if (ans.getCorrect()) {
                    uqs.getAnswers().add((Integer.toString(index.get())));
                }
                index.incrementAndGet();
            });
            goodAnswers.add(uqs);
        });

        AtomicInteger finalMark = new AtomicInteger();
        //couting mark
        goodAnswers.forEach(ga -> {

            userAnswers.forEach(ua -> {
                if (ga.getQuestion().equals(ua.getQuestion()) && ga.getAnswers().size() == ua.getAnswers().size()) {
                    AtomicInteger submarks = new AtomicInteger();
                    ga.getAnswers().forEach(sa -> {
                        if (ua.getAnswers().contains(sa)) submarks.incrementAndGet();
                    });
                    if (submarks.get() == ga.getAnswers().size()) {
                        finalMark.incrementAndGet();
                    }
                }
            });


        });

        System.out.println((float) finalMark.get() / goodAnswers.size());
        return ((float) finalMark.get() / goodAnswers.size()) * 100;
    }
}
