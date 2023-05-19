package com.heliohub.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heliohub.dslist.dto.GameMinDTO;
import com.heliohub.dslist.entities.Game;
import com.heliohub.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
		//Outro exemplo para eliminar uma linha e código mais limpo:
		//return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
}
