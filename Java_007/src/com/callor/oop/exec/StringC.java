package com.callor.oop.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.oop.utils.Line;

public class StringC {
	public static void main(String[] args) {

		String dataFile = "src/com/callor/oop/exec/data.txt";
		Scanner scan = null;
		InputStream is = null;

		/*
		 * ...data.txt 파일을 읽어서 무언가 처리를 ㅎ사려고한다 Java 에서 파일을 읽어서 무언가 처리를 하려면 먼저 파일을 열어야함.
		 * 이때 파일을 연느 도구 중에 FileInputStream 이라는 도구를 사용할 것이다
		 * 
		 * 그러나 파일을 여는 과정에서 어떠한 이유로든지 열고자 하는 파일이 없을 수 있음. 갑자기 사라질 수도 있다. 때문에 Java 에서는 파일을
		 * 여는 명령을 사용하는 코드에서는 반드시 try catch 를 사용하여 exception 예방을 하도록 강제하고 있다
		 */

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 오픈한 data.txt 파일에 대한 정보를 scanner 과 연결해주기
		scan = new Scanner(is);

		String line = scan.nextLine();
		// System.out.println(line);

		String[] result = line.split(",");

		int sum = 0;
		
			for (int i = 1; i < result.length; i++) {
				sum += Integer.valueOf(result[i]);
			}
			System.out.println(sum);

			while(scan.hasnextline()) {
				
			}
			
		scan.close();

	}

}
