package java43_javabasic_chapter07_homework;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {

		int[] price = new int[4];
		// 循环录入
		Scanner input = new Scanner(System.in);
		System.out.println("请输入4家店的价格:");
		for (int i = 0; i < price.length; i++) {
			System.out.print("第" + (i + 1) + "家店的价格:" );
			price[i] = input.nextInt();
		}
		
		// 求价格最小值
		int min = price[0];
		for (int i = 1; i < price.length; i++) {
			if (min > price[i]) {
				min = price[i];
			}
		}
		System.out.println("最低价格为："+min);
	}
}
