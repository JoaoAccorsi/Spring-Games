package com.games.game.dto;

import com.games.game.entities.Game;
import com.games.game.projections.GameMinProjection;

public class GameMinDTO {
    
    private Long id;
    private String title;
    private Integer year;
    private String genre;
	private String shortDescription;

    public GameMinDTO(){

    }

        // Import the attributes from Entity Games
    public GameMinDTO(Game entity){
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        genre = entity.getGenre();
        shortDescription = entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projection){
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        genre = projection.getGenre();
        shortDescription = projection.getShortDescription();
    }

    public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getGenre() {
		return genre;
    }

	public String getShortDescription() {
		return shortDescription;
	}
    
}