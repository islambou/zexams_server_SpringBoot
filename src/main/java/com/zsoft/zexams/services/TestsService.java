package com.zsoft.zexams.services;

import com.zsoft.zexams.modules.Test;
import com.zsoft.zexams.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestsService {

    @Autowired
    private TestRepository testRepository;

    public ArrayList<Test> getAll() {
        ArrayList<Test> result = new ArrayList<Test>();
        testRepository.findAll().forEach(result::add);

        return result;
    }

    public Test findById(String id) {
        return testRepository.findById(id).get();

    }

    public Test inserTest(Test test) {
        return testRepository.save(test);
    }

    public Test updateTest(Test test) {

        return testRepository.save(test);
    }

    public void delete(String testId) {
        testRepository.deleteById(testId);
    }
}
