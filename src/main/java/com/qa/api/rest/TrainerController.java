package com.qa.api.rest;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qa.api.domain.Trainer;
import com.qa.api.services.TrainerService;

@RestController
@RequestMapping("/trainers")
public class TrainerController {

	private TrainerService service;

	public TrainerController(TrainerService service) {
		super();
		this.service = service;
	}

	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public Trainer create(Trainer trainer) {
		return this.service.create(trainer);
	}

	@GetMapping("/get")
	public List<Trainer> get() {
		return this.service.get();
	}

	public List<Trainer> getByName(@RequestParam(name = "name", required = true) String name) {
		return this.service.getByName(name);
	}

}
