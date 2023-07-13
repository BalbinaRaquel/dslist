package com.balbinaraquel.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balbinaraquel.dslist.dto.GameMinDTO;

import com.balbinaraquel.dslist.entities.Game;
import com.balbinaraquel.dslist.repositories.GameRepository;  

@Service  //Component dependency injection (service) into the system
public class GameService {

	@Autowired //To inject a Game Repository instance into the Game Service
	private GameRepository  gameRepository;
	
	public List<GameMinDTO> findAll(){
	
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	
	
}

