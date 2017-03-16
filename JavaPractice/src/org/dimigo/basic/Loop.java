/**
 * 
 */
package org.dimigo.basic;
import java.util.Random;
import java.util.Scanner;
/**
 * @author 김정우
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
		System.out.println("<<게임 메뉴>>");
		System.out.println("1. 공격력 증가");
		System.out.println("2. 공격력 감소");
		System.out.println("3. 캐릭터 설정");
		System.out.println("9. 종료");
		System.out.println("------------------------");
		System.out.printf("메뉴 입력 =>");
		choice=scan.nextInt();
		switch(choice){
		case 1:
			System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n",a+=10);
			break;
		case 2:
			System.out.printf("공격력이 감소되었습니다. 현재 공격력 : %d\n",a-=10);
			break;
		case 3:
			String[] ww={"기사","법사","창고블린","여전사"};
			int clsNumb=new Random().nextInt(4);
			System.out.printf(ww[clsNumb]+"(으)로 설정되었습니다.\n");
			break;
		case 9:
			System.out.println("이제 공부하세요!");
			break;
		default :
			System.out.println("없는 메뉴입니다.");
		}
		}while(choice!=9);
	}
}