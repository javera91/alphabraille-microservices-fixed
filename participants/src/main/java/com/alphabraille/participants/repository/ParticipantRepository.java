package com.alphabraille.participants.repository;

import com.alphabraille.participants.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {}
