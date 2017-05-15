package org.dimigo.inheritance;

public class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone(){
		
	}
	public SmartPhone(String model, String company, int price){
		this.model=model;
		this.company=company;
		this.price=price;
	}
	public void turnOn(){
		System.out.println(model+"의 전원을 켭니다.");
	}
	public void turnoff(){
		System.out.println(model+"의 전원을 니다.");		
	}
	public void pay(){
		System.out.println(company+" 페이로 결제합니다.");
	}
	public void useSpecialFunction(SmartPhone phone){
		if(phone instanceof IPhone){
			IPhone s = (IPhone) phone;
			s.useAirDrop();
		}
		else if(phone instanceof Galaxy){
			Galaxy w=(Galaxy) phone;
			w.useWirelessCharging();
		}
		
	}
	public String toString(){
		return "모델명 : "+model+", 제조사 : "+company+", 가격 : "+price+"원";
	}
}
