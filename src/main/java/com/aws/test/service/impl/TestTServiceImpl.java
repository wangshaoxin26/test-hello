package com.aws.test.service.impl;

import com.aws.test.repo.TestTRepository;
import com.aws.test.repo.model.TestT;
import com.aws.test.service.TestTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TestTServiceImpl implements TestTService {

    @Autowired
    private TestTRepository repository;

    @Override
    @Cacheable(cacheNames = "cache", key = "#id")
    public String queryName(Long id) {
        return repository.findById(id).map(TestT::getName).orElse("-");
    }
}
