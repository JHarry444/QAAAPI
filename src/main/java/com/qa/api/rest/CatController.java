package com.qa.api.rest;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qa.api.domain.Cat;
import com.qa.api.services.CatService;

@RestController
@RequestMapping("/cats")
@CrossOrigin
public class CatController {

	private CatService service;

	public CatController(CatService service) {
		super();
		this.service = service;
	}

	@PostMapping("/createJSON")
	public Cat createJSON(@RequestBody Cat cat) {
		return this.service.create(cat);
	}

	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public Cat create(Cat cat) {
		return this.service.create(cat);
	}

	@GetMapping("/get")
	public List<Cat> get() {
		return this.service.get();
	}

	@GetMapping("/getByName")
	public List<Cat> getByName(@RequestParam(name = "name", required = true) String name) {
		return this.service.getByName(name);
	}

}
