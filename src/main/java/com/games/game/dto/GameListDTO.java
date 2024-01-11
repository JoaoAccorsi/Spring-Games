package com.games.game.dto;

import com.games.game.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
        // Constructor receives the full Entity
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}