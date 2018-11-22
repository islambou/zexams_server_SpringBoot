package com.zsoft.zexams.controllers;

import com.zsoft.zexams.modules.Test;
import com.zsoft.zexams.services.TestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestsController {
    @Autowired
    private TestsService testService;

    @RequestMapping("/tests")
    ArrayList<Test> getAll() {
        return testService.getAll();
    }

    @RequestMapping("/tests/{id}")
    Test getById(@PathVariable String id) {
        return testService.findById(id);
    }

    @RequestMapping(value = "/tests", method = RequestMethod.POST)
    Test addTest(@RequestBody Test test) {
        return testService.inserTest(test);
    }

    @RequestMapping(value = "/tests", method = RequestMethod.PATCH)
    Test updateTest(@RequestBody Test test) {
        return testService.updateTest(test);
    }

    @RequestMapping(value = "/tests/{id}", method = RequestMethod.DELETE)
    void deleteTest(@PathVariable String id) {
        testService.delete(id);
    }

}
