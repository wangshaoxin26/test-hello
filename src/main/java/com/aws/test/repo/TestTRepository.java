package com.aws.test.repo;


import com.aws.test.repo.model.TestT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestTRepository extends JpaRepository<TestT,Long> {
}
