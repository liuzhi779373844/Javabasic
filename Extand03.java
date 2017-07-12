package Java43_javabasic_chpater05_homework;

import java.util.Scanner;

public class Extand03 {
	public static void main(String[] args) {
		// 计算输入的日期距离1900年1月1日相距多少天。
		// 注意闰年每个月份天数不一样，使用while和do-while。
		/*
		 * 分析： 1、键盘录入一个年份，一个月份，一个日期 2、循环计算1900到year-1 年的天数； 3、再计算year当年的已过的天数。
		 * 
		 * 
		 */
		// 创建键盘录入

		Scanner input = new Scanner(System.in);
		System.out.println("请输入你选择的年份(大于1900年)：");
		int year = input.nextInt();
		System.out.println("请输入月份（1-12）：");
		int month = input.nextInt();
		System.out.println("请输入日期（符合当月的的最大天数）：");
		int day = input.nextInt();
		int i = 1900;
		int days = 0;
		// 计算year-1 年总共的天数
		while (i <= (year - 1)) {
			if ((i % 100 != 0 && i % 4 == 0) || i % 400 == 0) {
				days += 366;
			} else {
				days += 365;
			}
			i++;
		}

		// 计算year当年的天数；
		int days2 = 0;
		if ((i % 100 != 0 && i % 4 == 0) || i % 400 == 0) {
			switch (month - 1) {
			case 1:
				days2 = 31;
				break;
			case 2:
				days2 = 31 + 29;
				break;
			case 3:
				days2 = 31 + 29 + 31;
				break;
			case 4:
				days2 = 31 + 29 + 31 + 30;
				break;
			case 5:
				days2 = 31 + 29 + 31 + 30 + 31;
				break;
			case 6:
				days2 = 31 + 29 + 31 + 30 + 31 + 30;
				break;
			case 7:
				days2 = 31 + 29 + 31 + 30 + 31 + 30 + 31;
				break;
			case 8:
				days2 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
				break;
			case 9:
				days2 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				break;
			case 10:
				days2 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				break;
			case 11:
				days2 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				break;
			case 12:
				days2 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
				break;
			default:
			
				break;
			}
		} else {
			switch (month - 1) {
			case 1:
				days2 = 31;
				break;
			case 2:
				days2 = 31 + 28;
				break;
			case 3:
				days2 = 31 + 28 + 31;
				break;
			case 4:
				days2 = 31 + 28 + 31 + 30;
				break;
			case 5:
				days2 = 31 + 28 + 31 + 30 + 31;
				break;
			case 6:
				days2 = 31 + 28 + 31 + 30 + 31 + 30;
				break;
			case 7:
				days2 = 31 + 28 + 31 + 30 + 31 + 30 + 31;
				break;
			case 8:
				days2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
				break;
			case 9:
				days2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				break;
			case 10:
				days2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				break;
			case 11:
				days2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				break;
			case 12:
				days2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
				break;
			default:
				
				break;
			}

		}
		int totalDays = days + days2 + day - 1;
		System.out.println(year + "年" + month + "月" + day + "日到1900年1月1日总共有：" + totalDays + "天。");
	}

}
