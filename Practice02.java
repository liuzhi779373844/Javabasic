package java43_javabasic_chapter07_homework;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		double money[] = new double[5];
		double total=0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入会员本月的消费记录：");
		//循环录入五笔金额
		for (int i = 0; i < money.length; i++) {
			System.out.print("请输入第" + (i + 1) + "笔购物金额：");
			money[i] = input.nextDouble();
		}
		System.out.println("\n序号\t\t\t"+"金额（元）");
		//循环输出五笔金额并求和
		for(int i = 0;i<money.length;i++){
			System.out.println((i+1)+"\t\t\t"+money[i]);
			total += money[i];
		}
		System.out.println("总金额\t\t\t"+total);
	}
}
