package com.zsoft.zexams.services;

import com.zsoft.zexams.modules.*;
import com.zsoft.zexams.repositories.CandidateRepository;
import com.zsoft.zexams.repositories.UserTestAnswersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;


    public List<Candidate> getAll() {
        List<Candidate> result = new ArrayList<Candidate>();
        candidateRepository.findAll().forEach(result::add);

        return result;
    }

    public Candidate findById(String id) {
        return candidateRepository.findById(id).get();

    }

    public Candidate insert(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

}
