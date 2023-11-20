package com.games.game.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.games.game.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {


}