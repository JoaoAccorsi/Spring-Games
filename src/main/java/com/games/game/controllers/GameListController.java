package com.games.game.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.games.game.dto.GameListDTO;
import com.games.game.dto.GameMinDTO;
import com.games.game.service.GameListService;
import com.games.game.service.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;

	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll() {
			// Return the available Games Genres
		return gameListService.findAll();
    }

	@GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findbyList(@PathVariable Long listId){
		List<GameMinDTO> gamesByList = gameService.findByList(listId);
        return gamesByList;
    }
}