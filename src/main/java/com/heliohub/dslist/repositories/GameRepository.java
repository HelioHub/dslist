package com.heliohub.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heliohub.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	

}
