package java43_javabasic_chapter07_homework;

import java.util.Scanner;

public class ShortAnswerQuestion01 {
	public static void main(String[] args) {
		String[] arr = new String[5];
		Scanner input = new Scanner(System.in);
		// ѭ��¼����仰
		System.out.println("������5�仰��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("��" + (i + 1) + "�仰��");
			arr[i] = input.next();
		}
		System.out.println("\n�������5�仰Ϊ��");
		// ��������ַ�����
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
