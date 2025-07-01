package com.alphabraille.usability.service;

import com.alphabraille.usability.model.UsabilityLog;
import com.alphabraille.usability.repository.UsabilityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsabilityService {
    private final UsabilityRepository repository;

    public UsabilityService(UsabilityRepository repository) {
        this.repository = repository;
    }

    public List<UsabilityLog> findAll() { return repository.findAll(); }
    public UsabilityLog save(UsabilityLog log) { return repository.save(log); }
    public void deleteById(Long id) { repository.deleteById(id); }
    public UsabilityLog findById(Long id) { return repository.findById(id).orElse(null); }
}
