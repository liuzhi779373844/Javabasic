package java43_javabasic_chapter06_homework;

import java.util.Scanner;

public class Extand02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 判断一个数是不是质数，并将判断结果输出
		// 键盘录入
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		int num = input.nextInt();
		// 从2开始取余，等于零就停止判断，若i等于num就是质数，否则就不是质数
		int i;
		for (i = 2;; i++) {
			if (num % i == 0) {
				break;
			}
		}
		if (num == i) {
			System.out.println(num + "是质数。");
		} else {
			System.out.println(num + "不是质数。");
		}
	}

}
