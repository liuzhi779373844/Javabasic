package java43_javabasic_chapter06_homework;

import java.util.Scanner;

public class Extand02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ж�һ�����ǲ��������������жϽ�����
		// ����¼��
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����������");
		int num = input.nextInt();
		// ��2��ʼȡ�࣬�������ֹͣ�жϣ���i����num��������������Ͳ�������
		int i;
		for (i = 2;; i++) {
			if (num % i == 0) {
				break;
			}
		}
		if (num == i) {
			System.out.println(num + "��������");
		} else {
			System.out.println(num + "����������");
		}
	}

}
