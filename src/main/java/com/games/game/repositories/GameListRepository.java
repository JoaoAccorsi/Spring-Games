package com.games.game.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.games.game.entities.GameList;


public interface GameListRepository extends JpaRepository<GameList, Long> {

}