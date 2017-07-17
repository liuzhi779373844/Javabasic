package java43_javabasic_chapter07_homework;

import java.util.Scanner;

public class ShortAnswerQuestion01 {
	public static void main(String[] args) {
		String[] arr = new String[5];
		Scanner input = new Scanner(System.in);
		// 循环录入五句话
		System.out.println("请输入5句话：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("第" + (i + 1) + "句话：");
			arr[i] = input.next();
		}
		System.out.println("\n逆序输出5句话为：");
		// 逆序输出字符串；
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
