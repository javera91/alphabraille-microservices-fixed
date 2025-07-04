package com.alphabraille.participants.service;

import com.alphabraille.participants.client.UsabilityFeignClient;
import com.alphabraille.participants.dto.ParticipantWithUsabilityDto;
import com.alphabraille.participants.dto.UsabilityDto;
import com.alphabraille.participants.model.Participant;
import com.alphabraille.participants.repository.ParticipantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParticipantService {
    private final ParticipantRepository repository;
    private final UsabilityFeignClient usabilityFeignClient;

    public ParticipantService(ParticipantRepository repository, UsabilityFeignClient usabilityFeignClient) {
        this.repository = repository;
        this.usabilityFeignClient = usabilityFeignClient;
    }

    public List<Participant> findAll() { return repository.findAll(); }
    public Participant save(Participant p) { return repository.save(p); }
    public void deleteById(Long id) { repository.deleteById(id); }
    public Participant findById(Long id) { return repository.findById(id).orElse(null); }

    public List<ParticipantWithUsabilityDto> getParticipantsWithUsability() {
        List<Participant> participants = repository.findAll();
        List<UsabilityDto> usabilityRecords = usabilityFeignClient.getUsabilityRecords();
        
        return participants.stream().map(participant -> {
            List<UsabilityDto> participantUsability = usabilityRecords.stream()
                    .filter(usability -> usability.getParticipantId().equals(participant.getId()))
                    .collect(Collectors.toList());
            
            return new ParticipantWithUsabilityDto(
                    participant.getId(),
                    participant.getNombre(),
                    participant.getApellido(),
                    participant.getCorreo(),
                    participantUsability
            );
        }).collect(Collectors.toList());
    }
}
