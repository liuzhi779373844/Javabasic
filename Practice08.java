package Java43_javabasic_chpater05_homework;

import java.util.Scanner;

//�Ӽ�����������Ϊ������������1-7ʱ����ʵ�����Ӧ��Ӣ���������Ƶ���д

public class Practice08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		System.out.println("����������1-7��");
		int week = input.nextInt();
		do {
			switch (week) {
			case 1:
				System.out.println("������ MONDAY");
				break;
			case 2:
				System.out.println("������ TUESDAY");
				break;
			case 3:
				System.out.println("������  WEDNESDAY");
				break;
			case 4:
				System.out.println("������ THRSDAY");
				break;
			case 5:
				System.out.println("������ FRIDAY");
				break;
			case 6:
				System.out.println("������ SATURDAY");
				break;
			case 7:
				System.out.println("������ SUNDAY");
				break;
			default:
				System.out.println("���������������");
				break;
			}
			System.out.println("����������1-7��");
			week = input.nextInt();
		} while (week != 0);
	}
}
