package com.qa.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.api.domain.Cat;
import com.qa.api.repos.CatRepo;

@Service
public class CatService {

	private CatRepo repo;

	public CatService(CatRepo repo) {
		super();
		this.repo = repo;
	}

	public Cat create(Cat cat) {
		return this.repo.save(cat);
	}

	public List<Cat> get() {
		return this.repo.findAll();
	}

	public List<Cat> getByName(String name) {
		return this.repo.findByName(name);
	}
}
