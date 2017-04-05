package org.dimigo.oop;
import java.util.Scanner;
public class Question {

	public static void main(String[] args) {
		String[] que={"1. 가장 좋아하는 가수는?","2. 가장 좋아하는 배우는?","3. 가장 좋아하는 과목은?"};
		String[] ans={"아이린","송지효","스문"};		
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<3; i++){
        System.out.println(que[i]);
        String answer = scanner.nextLine();
			if(ans[i].equals(answer)){
			System.out.println("정답입니다!");
			}
			else{
			System.out.println("틀렸습니다!");
			}
		}
		System.out.println("<<결과 출력>>");
		System.out.println(que[0]+ans[0]+"입니다.");
		System.out.println(que[1]+ans[1]+"입니다.");
		System.out.println(que[2]+ans[2]+"입니다.");
		scanner.close();
}
}