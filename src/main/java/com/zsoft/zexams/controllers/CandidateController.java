package com.zsoft.zexams.controllers;


import com.zsoft.zexams.modules.Candidate;
import com.zsoft.zexams.modules.Question;
import com.zsoft.zexams.modules.SuccessLoginResponse;
import com.zsoft.zexams.services.CandidateService;
import com.zsoft.zexams.services.UserService;
import com.zsoft.zexams.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class CandidateController {

    @Autowired
    CandidateService candidateService;

    @PostMapping("candidate")
    Candidate postCandidate(@RequestBody Candidate form) {
        //System.out.println(form);
        Candidate inserted = candidateService.insert(form);
        System.out.println(inserted);
        return inserted;
    }

    @GetMapping("candidate")
    List<Candidate> getCandidates() {
        List<Candidate> list = candidateService.getAll();
        return list;
    }


}



