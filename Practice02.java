package java43_javabasic_chapter07_homework;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		double money[] = new double[5];
		double total=0;
		Scanner input = new Scanner(System.in);
		System.out.println("�������Ա���µ����Ѽ�¼��");
		//ѭ��¼����ʽ��
		for (int i = 0; i < money.length; i++) {
			System.out.print("�������" + (i + 1) + "�ʹ����");
			money[i] = input.nextDouble();
		}
		System.out.println("\n���\t\t\t"+"��Ԫ��");
		//ѭ�������ʽ����
		for(int i = 0;i<money.length;i++){
			System.out.println((i+1)+"\t\t\t"+money[i]);
			total += money[i];
		}
		System.out.println("�ܽ��\t\t\t"+total);
	}
}
