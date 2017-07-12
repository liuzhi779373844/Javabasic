package java43_javabasic_chapter06_homework;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping管理系统 >客户管理系统>添加客户信息\n");
		int custNo = 0;
		String birthday;
		int point = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("请输入会员号（4位整数）：");
			custNo = input.nextInt();
			System.out.println("请输入会员生日（月/日<用两位整数表示>）：");
			birthday = input.next();
			System.out.println("请输入会员积分：");
			point = input.nextInt();
			if (custNo > 9999 || custNo < 1000) {
				System.out.println("客户号" + custNo + "是无效会员号");
				System.out.println("录入信息失败！");
				continue;
			}
			System.out.println("您录入的信息为：");
			System.out.println(custNo + " " + birthday + " " + point + "\n");
		}
		System.out.println("程序结束！");
	}
}
