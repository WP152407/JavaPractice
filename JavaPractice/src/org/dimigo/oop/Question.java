package org.dimigo.oop;
import java.util.Scanner;
public class Question {

	public static void main(String[] args) {
		String[] que={"1. ���� �����ϴ� ������?","2. ���� �����ϴ� ����?","3. ���� �����ϴ� ������?"};
		String[] ans={"���̸�","����ȿ","����"};		
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<3; i++){
        System.out.println(que[i]);
        String answer = scanner.nextLine();
			if(ans[i].equals(answer)){
			System.out.println("�����Դϴ�!");
			}
			else{
			System.out.println("Ʋ�Ƚ��ϴ�!");
			}
		}
		System.out.println("<<��� ���>>");
		System.out.println(que[0]+ans[0]+"�Դϴ�.");
		System.out.println(que[1]+ans[1]+"�Դϴ�.");
		System.out.println(que[2]+ans[2]+"�Դϴ�.");
		scanner.close();
}
}