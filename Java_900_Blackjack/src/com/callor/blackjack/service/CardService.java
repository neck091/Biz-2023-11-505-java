package com.callor.blackjack.service;

import com.callor.blackjack.model.CardDto;

public interface CardService {
	
	public void makeCardDeck();
	public CardDto getCard();

}
