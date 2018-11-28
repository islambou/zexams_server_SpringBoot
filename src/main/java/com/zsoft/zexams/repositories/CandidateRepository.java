package com.zsoft.zexams.repositories;

import com.zsoft.zexams.modules.Candidate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CandidateRepository extends CrudRepository<Candidate, String> {


}
