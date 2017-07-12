package Java43_javabasic_chpater05_homework;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎使用MyShopping管理系统\n");
		System.out.println("*****************************");
		System.out.println("\t\t1、真情客户管理系统");
		System.out.println("\t\t2、真购物结算");
		System.out.println("\t\t3、真情回馈");
		System.out.println("\t\t4、注销");
		System.out.println("*****************************\n");
		boolean isRight = true;
		
		do{
			System.out.println("请选择，输入数字：");
			int number = input.nextInt();
			switch(number){
			case 1:
				System.out.println("执行客户管理系统");
				isRight = true;
				break;
			case 2:
				System.out.println("执行购物结算");
				isRight = true;
				break;
			 case 3:
				System.out.println("执行真情回馈");
				isRight = true;
				break;
			case 4:
				System.out.println("注销");
				isRight = true;
				break;
			default:
				System.out.println("输入有误，请输入正确的数字！");
				isRight = false;
				break;
			}
		}while(isRight==false);
		
	System.out.println("程序结束！");
	}
}
