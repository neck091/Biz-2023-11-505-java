package com.callor.hello.var;

public class VarA {
	public static void main(String[] args) {
		int num=0;
		num= num+20; //num변수값을 20 증가
		num += 20;//num 변수값을 20증가
		
		num=num-20; //num 변수값을 20감소
		num-=20;//num 변수값을 20감소
		
		//변수 = 값처럼 eq(=)가 한개있는 명령문을 만나면 
		//이전 코드에서 변수에 적용되었던 값들이
		//의미가 없어진다
		num=2;
		
		num =num+1; // num 변수값을 1증가
		num+=1; //1 증가
		num++; //num 변수값을 1 증가
		++num ;  //num 변수값을 1 증가
		
		num= num-1;// num 변수값을 1 감소
		num-=1;
		num--;
		--num;
		
		num = num *3;
		num *=3;
		
		num = num / 3;
		num /= 3;
		num = num % 3;
		num %= 3;
		
		num=num*1;
		num *=1;
		
		
		
		
		
	}

}
