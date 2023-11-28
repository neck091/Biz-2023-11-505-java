package com.callor.hello.method;

	public class MethodD {
		public static int add( ) {
			int num = 30;
			int num1 = 40;
			int sum = num+num1;
			return sum;
			
		}
		
		
		public static void main(String[] args) {
			int sum = add();
			
			System.out.println(sum);
		}

}
