/**
 * 
 */
package org.dimigo.basic;

/**
 * @author 김정우
 *
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-gene	rated method stub
	 	int ny=25;
	 	String name = "아이유",isMale="여자";
	 	double kg = 44.3,height = 161.8;
	 	char bloodType = 'A';
	 	System.out.println("<<아이유 프로필>>");
	 	System.out.printf("이름 : %s\n",name);
	 	System.out.printf("성별 : %s\n",isMale);
	 	System.out.printf("나이 : %d\n",ny);
	 	System.out.printf("키 : %.1fcm\n",height);
	 	System.out.printf("몸무게 : %.1fkg\n",kg);
	 	System.out.printf("혈액형 : %c형\n",bloodType);
	
	
	}

}
