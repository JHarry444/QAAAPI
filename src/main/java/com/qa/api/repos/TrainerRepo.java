package com.qa.api.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.api.domain.Trainer;

public interface TrainerRepo extends JpaRepository<Trainer, Integer> {

	List<Trainer> findByName(String name);
}
