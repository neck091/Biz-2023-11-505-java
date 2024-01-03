package com.callor.iolist.model;

public class IoListDto {

	
	public String date;
	public String name;
	public String client;
	public String ceo;
	public String divi;
	
	public int buy;
	public int sale; 
	public int num;
	
	
	public IoListDto(String date, String name, String client, String ceo, String divi, int num, int buy, int sale) {
		super();
		this.date = date;
		this.name = name;
		this.client =client;
		this.ceo = ceo;
		this.divi = divi;		
		this.num = num;
		this.buy = buy;
		this.sale = sale;
	}

}
