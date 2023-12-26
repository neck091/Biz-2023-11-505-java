package com.callor.blackjack.service;

import com.callor.blackjack.model.CardDto;

public interface PlayerService {
	
	public void hit(CardDto card);
	public void showCard();
	public int getScore();

}
