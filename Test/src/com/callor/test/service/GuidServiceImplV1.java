package com.callor.test.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.test.model.GuideDto;

public class GuidServiceImplV1 implements GuideService {
	List<GuideDto> guideList = null;
	String dataFile = null;
	InputStream is = null;
	
	public GuidServiceImplV1() {
		// TODO Auto-generated constructor stub
	}

	public GuidServiceImplV1(String dataFile) {
		this.dataFile = dataFile;
		this.guideList = new ArrayList<GuideDto>();
	}

	@Override
	public void loadGuide() {

		Scanner fileRead = null;
		InputStream is = null;

		try {
			is = new FileInputStream(dataFile);

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		fileRead = new Scanner(is);

		while (fileRead.hasNext()) {
			String line = fileRead.nextLine();

			GuideDto dto = new GuideDto();

			try {

				String[] lines = line.split(",", 4);
				dto.id = lines[0];
				dto.list = lines[1];
				dto.seq = lines[2];
				dto.guide = lines[3];

			} catch (Exception e) {
				// TODO: handle exception
				break;
			}

			guideList.add(dto);
		}
		fileRead.close();
	}

	@Override
	public void printGuideList() {
		this.loadGuide();
		System.out.println("=".repeat(100));
		String str = "";
		String str1 = "";

		for (GuideDto dto : guideList) {
			str = dto.id;
			if (str.equals(str1)) {
			} else if (str.equals(str1)) {
			} else {
				System.out.println("-".repeat(100));
			}
			System.out.printf("%s\t%s\t\t%s\t%s\n", dto.id, dto.list, dto.seq, dto.guide);
			str1 = str;
		}

		System.out.println("=".repeat(100));

	}

}
