package com.balbinaraquel.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balbinaraquel.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}

