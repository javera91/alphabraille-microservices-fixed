package com.alphabraille.usability.repository;

import com.alphabraille.usability.model.UsabilityLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsabilityRepository extends JpaRepository<UsabilityLog, Long> {}
