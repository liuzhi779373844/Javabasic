package java43_javabasic_chapter06_homework;

import java.util.Scanner;

public class ShortAnswerQuestion01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����������ֱ�洢ʱ�������
		Scanner input = new Scanner(System.in);
		int time = 0;
		int totalTime = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("��������" + i + "��ѧϰʱ�䣺");
			time = input.nextInt();
			totalTime += time;
		}
		double avg = totalTime * 1.0 / 5;
		System.out.println("��һ������ÿ�յ�ƽ��ѧϰʱ���ǣ�" + avg);
	}
}
