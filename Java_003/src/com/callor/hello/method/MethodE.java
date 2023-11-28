package com.callor.hello.method;

public class MethodE {
	
	public static int buy(int money) {
		//int money = 2000;
		int cup=1500;
		int change = money - cup;
		
		
		return change;
	}
	
	
	public static void main(String[] args) {
		
		int myMoney = 2000;
		
		int change = buy(myMoney);
		System.out.printf("전달한 값 %d, 잔액 : %d\n",myMoney,change);
		
		

		
		
		
		
	}

}
