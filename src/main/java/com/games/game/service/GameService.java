package com.games.game.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.games.game.dto.GameMinDTO;
import com.games.game.entities.Game;
import com.games.game.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
            // Change the return Game into GameMinDTO --> Limit the number of returned attributes
        List<Game> listGame = gameRepository.findAll();
        return listGame.stream().map(x -> new GameMinDTO(x)).toList();
    }
}