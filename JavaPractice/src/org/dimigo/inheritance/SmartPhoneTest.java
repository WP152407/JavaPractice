package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] ph={
				new IPhone("iphone","애플",900000),
				new Galaxy("갤럭시 S8","삼성",800000)
		};
		for(SmartPhone ss:ph){
			System.out.println(ss.toString());
			ss.turnOn();
			ss.pay();
			ss.useSpecialFunction(ss);
			ss.turnoff();
		}
		
	}

}
