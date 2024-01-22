package com.games.game.projections;

public interface GameMinProjection {
    
    Long getId();
	String getTitle();
	Integer getGameYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
	Integer getYear();
	String getGenre();
}