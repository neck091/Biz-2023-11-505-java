package com.callor.blackjack.service.impl;

import java.util.ArrayList;
import java.util.List;


import com.callor.blackjack.model.CardDto;
import com.callor.blackjack.service.CardService;

/*
 * 카드서비스 인터페이스 상속, 메서드 구현
 * 
 * 카드디토 객체를 요소로 하는 리스트를 클래스 영역에 선언 
 * 생성자에서 리스트 객체를 초기화
 * 만든카드덱 메서드에서 카드디토를 생성하여 리스트에 add 하는 코드 작성
 *  
 */

public class CardServiceImplV1 implements CardService {
	private List<CardDto> cardList = null;
	//클래스 영역에 리스트를 선언하여 현재 클래스의 생성자 만든카드 . 겟 카드 메서드에서 공유(접근가능)하도록 한다
	//특별한 경우가 아니면 private로 보호하기
	

	public CardServiceImplV1() {
		cardList = new ArrayList<CardDto>();
		this.makeCardDeck();

		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeCardDeck() {

		String strSuit = "◆♤♣♡";
		String strDenomi = "A234567890KQJ";

		String[] suits = strSuit.split("");
		String[] denomis = strDenomi.split("");

		for (String suit : suits) {
			for (String deno : denomis) {

				CardDto cardDto = new CardDto();
				cardDto.suit = suit;
				cardDto.denomiation = deno;
		
				int value = 0;


				try {
					value = Integer.valueOf(deno);

				} catch (Exception e) {

					if (deno.equals("A"))
						value = 1;
					else
						value = 10;

				}
				if (value < 1) { 
					
					value = 10;
				cardDto.denomiation = "10";	
				}
				cardDto.value = value;
				cardList.add(cardDto);
			} //deno
		}//suit
		
		int size =cardList.size();
		
		for(int i =0; i<100 ; i++) {
			int index1=(int)(Math.random()*size);
			int index2=(int)(Math.random()*size);
			
			CardDto _dto = cardList.get(index1);
			cardList.set(index1,cardList.get(index2));
			cardList.set(index2, _dto);
			
			
		}
		
		
		//테스트
	//for(CardDto dto : cardList) {
		//	System.out.println(dto.toString());}
		}
	
	//cardList 에서 임의의 카드 한장을 리턴하는 메서드

	@Override
	public CardDto getCard() {
		
		if(cardList.isEmpty()) this.makeCardDeck();
	
		
		//가장 보편적인 코드
	//	CardDto getCard = cardList.get(0);
	//	cardList.remove(0);
		
		// remove 특성을 활용한 코드
		//CardDto getCard = cardList.remove(0);
	//	return getCard;
		
		//별도의 변수를 만들지 않기
		return cardList.remove(0);
	}

}
