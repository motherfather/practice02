package prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		/* 구현코드 */
		System.out.print("금액:");
		Scanner scan = new Scanner(System.in);
		
		int won = scan.nextInt();
		while(true) {
			System.out.println("50000원: " + won / 50000 + "개");
			int tmp = won % 50000;
			System.out.println("10000원: " + tmp / 10000 + "개");
			tmp %= 10000;
			System.out.println("5000원: " + tmp / 5000 + "개");
			tmp %= 5000;
			System.out.println("1000원: " + tmp / 1000 + "개");
			tmp %= 1000;
			System.out.println("500원: " + tmp / 500 + "개");
			tmp %= 500;
			System.out.println("100원: " + tmp / 100 + "개");
			tmp %= 100;
			System.out.println("50원: " + tmp / 50 + "개");
			tmp %= 50;
			System.out.println("10원: " + tmp / 10 + "개");
			tmp %= 10;
			System.out.println("5원: " + tmp / 5 + "개");
			tmp %= 5;
			System.out.println("1원: " + tmp + "개");
					 

//			int tmp = 1;
//			int w50000 = 0, w10000 = 0, w5000 = 0, w1000 = 0, w500 = 0, w100 = 0, w50 = 0, w10 = 0, w5 = 0 , w1 = 0;
//			if(won / 50000 >= 1) {
//				w50000 = won / 50000;
//				tmp = won % 50000;  
//				System.out.println("50000원: " + w50000 + "개");
//			}
//			if(tmp / 10000 >= 1) {
//				w10000 = tmp / 10000;
//				tmp = won % 10000;
//				System.out.println("10000원: " + w10000 + "개");
//			}
//			if(tmp / 5000 >= 1) {
//				w5000 = tmp / 5000;
//				tmp = won % 5000;
//				System.out.println("5000원: " + w5000 + "개");
//			}
//			if(tmp / 1000 >= 1) {
//				w1000 = tmp / 1000;
//				tmp = won % 1000;
//				System.out.println("1000원: " + w1000 + "개");
//			}
//			if(tmp / 500 >= 1) {
//				w500 = tmp / 500;
//				tmp = won % 500;
//				System.out.println("500원: " + w500 + "개");
//			}
//			if(tmp / 100 >= 1) {
//				w100 = tmp / 100;
//				tmp = won % 100;
//				System.out.println("100원: " + w100 + "개");
//			}
//			if(tmp / 50 >= 1) {
//				w50 = tmp / 50;
//				tmp = won % 50;
//				System.out.println("50원: " + w50 + "개");
//			}
//			if(tmp / 10 >= 1) {
//				w10 = tmp / 10;
//				tmp = won % 10;
//				System.out.println("10원: " + w10 + "개");
//			}
//			if(tmp / 5 >= 1) {
//				w5 = tmp / 5;
//				tmp = won % 5;
//				System.out.println("5원: " + w5 + "개");
//			}
//			System.out.println("1원: " + w1 + "개");
			break;
			}
		
		scan.close();
	}
}

