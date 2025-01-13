package com.qa.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.api.domain.Trainer;
import com.qa.api.repos.TrainerRepo;

@Service
public class TrainerService {

	private TrainerRepo repo;

	public TrainerService(TrainerRepo repo) {
		super();
		this.repo = repo;
	}

	public Trainer create(Trainer trainer) {
		return this.repo.save(trainer);
	}

	public List<Trainer> get() {
		return this.repo.findAll();
	}

	public List<Trainer> getByName(String name) {
		return this.repo.findByName(name);
	}
}
