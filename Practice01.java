package java43_javabasic_Homework;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// /**
		// * 现实我行我素购物管理系统的登录菜单
		// * /

		System.out.println("\n\t\t欢迎使用我行我素购物管理系统1.0版\n");
		System.out.println("\t\t\t1、登录系统\n");
		System.out.println("\t\t\t2、退出\n");
		System.out.println("***********************************************************");

		// 键盘录入你选择的数字
		Scanner input = new Scanner(System.in);
		System.out.println("请选择，输入数字：");
		/*
		 * int number = input.nextInt(); switch(number){ case 1: //现实系统主菜单
		 * System.out.println("\n\t\t欢迎使用我行我素管理购物系统\n");
		 * System.out.println("\t\t\t1、 客户信息管理\n");
		 * System.out.println("\t\t\t2、 购物结算\n");
		 * System.out.println("\t\t\t3、 真情回馈\n");
		 * System.out.println("\t\t\t4、 注销\n"); break; case 2: //退出系统
		 * System.out.println("谢谢您的使用！"); break; default:
		 * System.out.println("输入错误"); break; }
		 */
		if (input.hasNextInt()) {
			int number = input.nextInt();
			switch (number) {
			case 1:
				// 现实系统主菜单
				System.out.println("\n\t\t欢迎使用我行我素管理购物系统\n");
				System.out.println("\t\t\t1、 客户信息管理\n");
				System.out.println("\t\t\t2、 购物结算\n");
				System.out.println("\t\t\t3、 真情回馈\n");
				System.out.println("\t\t\t4、 注销\n");
				System.out.println("***********************************************************\n");
				System.out.println("请输入你的选择");
				if(input.hasNextInt()){
					int number2 = input.nextInt();
					switch(number2){
					case 1:
						System.out.println("购物管理系统>>客户管理系统\n");
						System.out.println("\t\t\t1、显示所有客户信息\n");
						System.out.println("\t\t\t2、添加客户信息\n");
						System.out.println("\t\t\t3、修改客户信息\n");
						System.out.println("\t\t\t4、查询客户信息\n");
						System.out.println("***********************************************************\n");
						break;
					case 3:
						System.out.println("\n购物管理系统>>真情回馈\n");
						System.out.println("\t\t\t1、幸运大放送\n");
						System.out.println("\t\t\t2、幸运抽奖\n");
						System.out.println("\t\t\t3、生日问候\n");
						break;
					default:
						System.out.println("还未开放该功能！");
						
					}
					
				}else{
					System.out.println("请输入正确的数字！");
				}
				break;
			case 2:
				// 退出系统
				System.out.println("谢谢您的使用！");
				break;
			default:
				System.out.println("输入错误");
				break;
			}
		} else {
			System.out.println("请输入正确的数字！");
		}
	}

}
