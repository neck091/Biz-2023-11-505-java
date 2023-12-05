package com.callor.oop.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StringCA {
	public static void main(String[] args) {

		String dataFile = "src/com/callor/oop/exec/data.txt";
		Scanner scan = null;
		InputStream is = null;

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(dataFile+"파일을 찾을 수 없음");
		}

		scan = new Scanner(is);
		while(scan.hasNextLine()) {
			//if(scan.hasNextLine()) {
		String line = scan.nextLine();
	

		String[] scores = line.split(",");

		int scoreTotal = 0;
		
		
		for (int i = 1; i < scores.length; i++) {
			scoreTotal += Integer.valueOf(scores[i]);
		}
		System.out.printf("%s 번 총점 : %d\n",scores[0],scoreTotal);
		}
		


		scan.close();

				

	}

}
