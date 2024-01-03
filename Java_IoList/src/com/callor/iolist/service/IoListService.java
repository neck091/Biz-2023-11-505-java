package com.callor.iolist.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.iolist.model.IoListDto;

public class IoListService {
	List<IoListDto> ioList = null;
	Scanner scan = null;
	String dataFile = null;

	public IoListService() {

	}

	public IoListService(String dataFile) {
		this.dataFile = dataFile;
		ioList = new ArrayList<IoListDto>();
	}

	public void loadIoList() {

		InputStream is = null;

		try {
			is = new FileInputStream(dataFile);

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		scan = new Scanner(is);

		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] lines = line.split(",");
			


			IoListDto iLDto = new IoListDto(
					lines[0],
					lines[2],
					lines[3], 
					lines[4], 
					lines[5],
					Integer.valueOf(lines[6]), 
					Integer.valueOf(lines[7]),
					Integer.valueOf(lines[8])
			);
			ioList.add(iLDto);
		}
	scan.close();

	}

	public void printIoList() {
		this.loadIoList();

		System.out.println("=".repeat(50));
		System.out.println("거래일자\t거래처\t\t\t\t상품이름\t매입금액\t판매금액");
		System.out.println("-".repeat(50));

		int buy = 0;
		int sale = 0;

		for (IoListDto dto : ioList) {
			System.out.printf("%s\t%s\t\t%s\t",dto.date,dto.client,dto.name);
			if(dto.divi.equals("1")) {
			System.out.printf("%d\t%d\n",dto.buy*dto.num, 0);
			}else {
				System.out.printf("%d\t%d\n",0 , dto.sale*dto.num);
			}
			buy += dto.buy*dto.num;
			sale += dto.sale*dto.num;

		}
		System.out.println("-".repeat(50));
		System.out.printf("거래건수\t%d건\t\t%d\t%d\n",ioList.size(),buy,sale);
		System.out.println("=".repeat(50));

	}
}
