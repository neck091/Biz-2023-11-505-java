package com.callor.iolist.exec;

import com.callor.iolist.service.IoListService;

public class Exec {
	public static void main(String[] args) {
		String dataFile  = "src/com/callor/iolist/service/매입매출데이터.txt";
		IoListService list = new IoListService(dataFile);
		
		list.printIoList();
		
	}

}
