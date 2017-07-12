package Java43_javabasic_chpater05_homework;

import java.util.Scanner;

//从键盘上输入以为整数，当输入1-7时，现实下面对应的英文星期名称的缩写

public class Practice08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		System.out.println("请输入数字1-7：");
		int week = input.nextInt();
		do {
			switch (week) {
			case 1:
				System.out.println("今天是 MONDAY");
				break;
			case 2:
				System.out.println("今天是 TUESDAY");
				break;
			case 3:
				System.out.println("今天是  WEDNESDAY");
				break;
			case 4:
				System.out.println("今天是 THRSDAY");
				break;
			case 5:
				System.out.println("今天是 FRIDAY");
				break;
			case 6:
				System.out.println("今天是 SATURDAY");
				break;
			case 7:
				System.out.println("今天是 SUNDAY");
				break;
			default:
				System.out.println("你输入的数字有误！");
				break;
			}
			System.out.println("请输入数字1-7：");
			week = input.nextInt();
		} while (week != 0);
	}
}
