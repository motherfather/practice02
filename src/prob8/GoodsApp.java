package prob8;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods[] goodsArray = new Goods[3];
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			String line = scanner.nextLine();
			String[] infos = line.split(" ");
			
			String name = infos[0];
			int price = Integer.parseInt(infos[1]);
			int countStock = Integer.parseInt(infos[2]);
			
			
			System.out.println(name + "(가격:" + price + "원)이 " + countStock + "개 입고 되었습니다.");
			
		}
		
		scanner.close();		
	}

}
