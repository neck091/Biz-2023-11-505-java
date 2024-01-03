package com.callor.test.exec;

import com.callor.test.service.GuidServiceImplV1;

public class Exec {
	public static void main(String[] args) {
		String File = "src/com/callor/test/service/Guide.txt";
		GuidServiceImplV1 guide = new GuidServiceImplV1(File);

		guide.printGuideList();
	}

}
