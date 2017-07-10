package java43_javabasic_Homework;

import java.util.Scanner;

public class SampleAnswerQuestion04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你选择的月份：");
		int month = input.nextInt();
		System.out.println("请选择你的舱型（头等舱/经济舱）：");
		String str = input.next();
		double money = 0;

		switch (month) {
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			switch (str) {
			case "头等舱":
				money = 5000 * 0.9;
				break;
			case "经济舱":
				money = 5000 * 0.8;
				break;
				break;

			case 1:
			case 2:
			case 3:
			case 11:
			case 12:
				switch (str) {
				case "头等舱":
					money = 5000 * 0.5;
					break;
				case "经济舱":
					money = 5000 * 0.4;
					break;
					break;
				}
			}
		}

	}
}
