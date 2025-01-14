package com.qa.api.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.api.domain.Cat;

public interface CatRepo extends JpaRepository<Cat, Integer> {

	List<Cat> findByName(String name);
}
