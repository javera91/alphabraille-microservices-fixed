package com.alphabraille.participants.service;

import com.alphabraille.participants.model.Participant;
import com.alphabraille.participants.repository.ParticipantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantService {
    private final ParticipantRepository repository;

    public ParticipantService(ParticipantRepository repository) {
        this.repository = repository;
    }

    public List<Participant> findAll() { return repository.findAll(); }
    public Participant save(Participant p) { return repository.save(p); }
    public void deleteById(Long id) { repository.deleteById(id); }
    public Participant findById(Long id) { return repository.findById(id).orElse(null); }
}
