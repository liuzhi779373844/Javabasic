package Java43_javabasic_chpater05_homework;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明循环变量
		double shirtPrice = 245.0;
		double shoePrice = 570.0;
		double PadPrice = 320.0;
		
		System.out.println("MyShopping管理系统 > 购物结算");
		System.out.println("\n**************************");
		System.out.println("请选择选购的商品编号：");
		System.out.println("1、T恤\t2、网球鞋\t3、网球拍");
		System.out.println("\n**************************");
		
		Scanner input = new Scanner(System.in);
		
		String reply = "y";
		while("y".equals(reply)){
			System.out.print("请输入你要查询的商品编号：");
			int number = input.nextInt();
			switch(number){
			case 1:
				System.out.println("T恤\t￥245.0");
				break;
			case 2:
				System.out.println("网球鞋\t$570.0");
				break;
			case 3:
				System.out.println("网球拍\t$320.0");
				break;
				default:
					System.out.println("查无此货！滚蛋！！！");
				break;
					
			}
			System.out.print("是否继续（n/y）：");
			reply = input.next();
			
			
		}
		System.out.println("用完此软件请走吧！");
		
	}

}
