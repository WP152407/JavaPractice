/**
 * 
 */
package org.dimigo.basic;
import java.util.Random;
import java.util.Scanner;
/**
 * @author ������
 *
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100,choice;
		Scanner scan=new Scanner(System.in);
		do{
		System.out.println("------------------------");
		System.out.println("<<���� �޴�>>");
		System.out.println("1. ���ݷ� ����");
		System.out.println("2. ���ݷ� ����");
		System.out.println("3. ĳ���� ����");
		System.out.println("9. ����");
		System.out.println("------------------------");
		System.out.printf("�޴� �Է� =>");
		choice=scan.nextInt();
		switch(choice){
		case 1:
			System.out.printf("���ݷ��� �����Ǿ����ϴ�. ���� ���ݷ� : %d\n",a+=10);
			break;
		case 2:
			System.out.printf("���ݷ��� ���ҵǾ����ϴ�. ���� ���ݷ� : %d\n",a-=10);
			break;
		case 3:
			String[] ww={"���","����","â���","������"};
			int clsNumb=new Random().nextInt(4);
			System.out.printf(ww[clsNumb]+"(��)�� �����Ǿ����ϴ�.\n");
			break;
		case 9:
			System.out.println("���� �����ϼ���!");
			break;
		default :
			System.out.println("���� �޴��Դϴ�.");
		}
		}while(choice!=9);
	}
}