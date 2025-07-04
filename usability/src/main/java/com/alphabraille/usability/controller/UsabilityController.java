package com.alphabraille.usability.controller;

import com.alphabraille.usability.dto.UsabilityDto;
import com.alphabraille.usability.model.UsabilityLog;
import com.alphabraille.usability.service.UsabilityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usability")
public class UsabilityController {
    private final UsabilityService service;

    public UsabilityController(UsabilityService service) {
        this.service = service;
    }

    @GetMapping
    public List<UsabilityLog> all() { return service.findAll(); }
    
    @GetMapping("/records")
    public List<UsabilityDto> getAllRecords() { return service.getUsabilityRecords(); }

    @PostMapping
    public UsabilityLog create(@RequestBody UsabilityLog log) { return service.save(log); }

    @GetMapping("/{id}")
    public UsabilityLog get(@PathVariable Long id) { return service.findById(id); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
}
