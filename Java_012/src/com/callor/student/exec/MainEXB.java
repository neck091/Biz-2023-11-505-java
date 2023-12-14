package com.callor.student.exec;

import com.callor.student.service.StartService;
import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StartServiceImplV2;
import com.callor.student.service.impl.StudentServiceImplV2;

public class MainEXB {
	
	
//인터페이스를 활용한 클래스간 결합도 낮추기 다른 클래스의 객체를 연결하여 사용해야 하는 경우 
	//보통은 각 클래스에서 다른 클래스이 객체를 생성하여 사용하는데 그러한 코드는 결합도가 매우 높아진다 
	//하진만 인터페이스르 매개변수로 하고 생성자를 통하여 생성된객체를 주입하면 결합도를 매우 낮풀 수 있다
	
	public static void main(String[] args) {
		StudentService stService = new StudentServiceImplV2();
		StartService startService = new StartServiceImplV2(stService);
		
		startService.startApp();
		
		
	}
}
