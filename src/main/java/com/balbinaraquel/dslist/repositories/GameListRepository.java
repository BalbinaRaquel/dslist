package com.balbinaraquel.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balbinaraquel.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}

