package java43_javabasic_chapter06_homework;

import java.util.Scanner;

public class ShortAnswerQuestion01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 两个变量，分别存储时间和天数
		Scanner input = new Scanner(System.in);
		int time = 0;
		int totalTime = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("请输入周" + i + "的学习时间：");
			time = input.nextInt();
			totalTime += time;
		}
		double avg = totalTime * 1.0 / 5;
		System.out.println("周一至周五每日的平均学习时间是：" + avg);
	}
}
