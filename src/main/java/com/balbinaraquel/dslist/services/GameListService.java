package com.balbinaraquel.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.balbinaraquel.dslist.dto.GameListDTO;
import com.balbinaraquel.dslist.entities.GameList;
import com.balbinaraquel.dslist.repositories.GameListRepository;  

@Service  //Component dependency injection (service) into the system
public class GameListService {

	@Autowired //To inject a Game Repository instance into the Game Service
	private GameListRepository  gameListRepository;
	
		
	@Transactional(readOnly = true) 
	public List<GameListDTO> findAll(){
	
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
		
	}
	
	
	
}

