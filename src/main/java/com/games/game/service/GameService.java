package com.games.game.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.games.game.dto.GameDTO;
import com.games.game.dto.GameMinDTO;
import com.games.game.entities.Game;
import com.games.game.projections.GameMinProjection;
import com.games.game.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
            // Change the return Game into GameMinDTO --> Limit the number of returned attributes
        List<Game> listGame = gameRepository.findAll();
        return listGame.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game gameById = gameRepository.findById(id).get();
        return new GameDTO(gameById);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
            // Return the games of a game list (RPG, Platform...)
        List<GameMinProjection> listGamesById = gameRepository.searchByList(listId);
        return listGamesById.stream().map(x -> new GameMinDTO(x)).toList();
    }
}