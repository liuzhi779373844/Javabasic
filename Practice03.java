package Java43_javabasic_chpater05_homework;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double shirtPrice = 245.0;
		double shoePrice = 570.0;
		double PadPrice = 320.0;
		int amount = 0;
		double discount = 0.8;
		double total = 0;
		double zong = 0;
		double payment = 0;
		String reply = "y";

		System.out.println("MyShopping管理系统 > 购物结算");
		System.out.println("\n**************************");
		System.out.println("请选择选购的商品编号：");
		System.out.println("1、T恤\t2、网球鞋\t3、网球拍");
		System.out.println("\n**************************");

		Scanner input = new Scanner(System.in);

		do {
			System.out.print("请输入商品编号：");
			int number1 = input.nextInt();// 编号
			System.out.print("请输入购买数量：");
			int number2 = input.nextInt();// 数量
			switch (number1) {
			case 1:
				total = shirtPrice * number2;
				System.out.println("T恤 ￥245.0\t数量" + number2 + "合计" + total);
				break;
			case 2:
				total = shoePrice * number2;
				System.out.println("网球鞋 ￥570.0\t数量" + number2 + "合计" + total);

				break;
			case 3:
				total = PadPrice * number2;
				System.out.println("网球拍 ￥320.0\t数量" + number2 + "合计" + total);

				break;
			default:
				System.out.println("查无此货！滚蛋！！！");
				break;
			}

			zong += total;
			System.out.print("是否继续（n/y）：");
			reply = input.next();
		} while ("y".equals(reply));

		System.out.println("折扣：" + discount);
		System.out.println("应付金额：" + zong * discount);
		System.out.print("实付金额为");
		payment = input.nextDouble();
		System.out.println("找钱：" + (payment - zong * discount));
	}

}
