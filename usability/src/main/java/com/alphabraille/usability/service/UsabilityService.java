package com.alphabraille.usability.service;

import com.alphabraille.usability.dto.UsabilityDto;
import com.alphabraille.usability.model.UsabilityLog;
import com.alphabraille.usability.repository.UsabilityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    
    public List<UsabilityDto> getUsabilityRecords() {
        return repository.findAll().stream()
                .map(log -> new UsabilityDto(
                        Long.valueOf(log.getId()),
                        Long.valueOf(log.getId()), // El id del log ES el participantId
                        log.getEstado()
                ))
                .collect(Collectors.toList());
    }
}
