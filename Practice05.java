package java43_javabasic_chapter07_homework;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {

		int[] price = new int[4];
		// ѭ��¼��
		Scanner input = new Scanner(System.in);
		System.out.println("������4�ҵ�ļ۸�:");
		for (int i = 0; i < price.length; i++) {
			System.out.print("��" + (i + 1) + "�ҵ�ļ۸�:" );
			price[i] = input.nextInt();
		}
		
		// ��۸���Сֵ
		int min = price[0];
		for (int i = 1; i < price.length; i++) {
			if (min > price[i]) {
				min = price[i];
			}
		}
		System.out.println("��ͼ۸�Ϊ��"+min);
	}
}
