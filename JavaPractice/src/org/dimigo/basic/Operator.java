/**
 * 
 */
package org.dimigo.basic;

/**
 * @author 김정우
 *
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long avg=1700000,emp = 3,number = 1500;
		long k;
		k=avg*12*emp*number;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.printf("월 평균 급여 : %,d\n",avg);
		System.out.printf("점포 내 직원 수 : %d명\n",emp);
		System.out.printf("점포 수 : %,d\n\n\n",number);
		System.out.printf("연간 인건비 : %,d",k);
	}

}
