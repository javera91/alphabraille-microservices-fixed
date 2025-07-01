package com.alphabraille.participants.controller;

import com.alphabraille.participants.model.Participant;
import com.alphabraille.participants.service.ParticipantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/participants")
public class ParticipantController {
    private final ParticipantService service;

    public ParticipantController(ParticipantService service) {
        this.service = service;
    }

    @GetMapping
    public List<Participant> all() { return service.findAll(); }

    @PostMapping
    public Participant create(@RequestBody Participant p) { return service.save(p); }

    @GetMapping("/{id}")
    public Participant get(@PathVariable Long id) { return service.findById(id); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
}
