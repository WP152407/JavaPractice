package org.dimigo.oop;

public class CarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 car1=new Car3("�����ڵ���","���׽ý�","������",225,50000000);
		Car3 car2=new Car3("����ڵ���","K7","���",246);
		Car3 car3=new Car3("�Ｚ�ڵ���","SM7","ȸ��");
//		
//		car1.setCompany("�����ڵ���");
//		car1.setModel("���׽ý�");
//		car1.setColor("������");
//		car1.setMaxSpeed(225);
//		car1.setPrice(50000000);
//		
//		car2.setCompany("����ڵ���");
//		car2.setModel("K7");
//		car2.setColor("���");
//		car2.setMaxSpeed(246);
//		car2.setPrice(40000000);
//		
//		car3.setCompany("�Ｚ�ڵ���");
//		car3.setModel("SM7");
//		car3.setColor("ȸ��");
//		car3.setMaxSpeed(200);
//		car3.setPrice(38000000);
//		
		System.out.println("<<�ڵ��� ���>>");
		System.out.println("������� : "+car1.getCompany());
		System.out.println("�𵨸� : "+car1.getModel());
		System.out.println("���� : "+car1.getColor());
		System.out.println("�ִ�ӵ� : "+car1.getMaxSpeed()+"km");
		System.out.println("���� : "+String.format("%,d",car1.getPrice())+"��\n");
		

		System.out.println("������� : "+car2.getCompany());
		System.out.println("�𵨸� : "+car2.getModel());
		System.out.println("���� : "+car2.getColor());
		System.out.println("�ִ�ӵ� : "+car2.getMaxSpeed()+"km");
		System.out.println("���� : "+String.format("%,d",car2.getPrice())+"��\n");

		System.out.println("������� : "+car3.getCompany());
		System.out.println("�𵨸� : "+car3.getModel());
		System.out.println("���� : "+car3.getColor());
		System.out.println("�ִ�ӵ� : "+car3.getMaxSpeed()+"km");
		System.out.println("���� : "+String.format("%,d",car3.getPrice())+"��\n");

		
	}

}
