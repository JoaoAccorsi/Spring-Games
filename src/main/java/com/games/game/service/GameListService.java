package com.games.game.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.games.game.dto.GameListDTO;
import com.games.game.entities.GameList;
import com.games.game.repositories.GameListRepository;

@Service
public class GameListService {
    
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
            // Change the return Game into GameMinDTO --> Limit the number of returned attributes
        List<GameList> gameList = gameListRepository.findAll();
        return gameList.stream().map(x -> new GameListDTO(x)).toList();
    }
}