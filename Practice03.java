package Java43_javabasic_chpater05_homework;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double shirtPrice = 245.0;
		double shoePrice = 570.0;
		double PadPrice = 320.0;
		int amount = 0;
		double discount = 0.8;
		double total = 0;
		double zong = 0;
		double payment = 0;
		String reply = "y";

		System.out.println("MyShopping����ϵͳ > �������");
		System.out.println("\n**************************");
		System.out.println("��ѡ��ѡ������Ʒ��ţ�");
		System.out.println("1��T��\t2������Ь\t3��������");
		System.out.println("\n**************************");

		Scanner input = new Scanner(System.in);

		do {
			System.out.print("��������Ʒ��ţ�");
			int number1 = input.nextInt();// ���
			System.out.print("�����빺��������");
			int number2 = input.nextInt();// ����
			switch (number1) {
			case 1:
				total = shirtPrice * number2;
				System.out.println("T�� ��245.0\t����" + number2 + "�ϼ�" + total);
				break;
			case 2:
				total = shoePrice * number2;
				System.out.println("����Ь ��570.0\t����" + number2 + "�ϼ�" + total);

				break;
			case 3:
				total = PadPrice * number2;
				System.out.println("������ ��320.0\t����" + number2 + "�ϼ�" + total);

				break;
			default:
				System.out.println("���޴˻�������������");
				break;
			}

			zong += total;
			System.out.print("�Ƿ������n/y����");
			reply = input.next();
		} while ("y".equals(reply));

		System.out.println("�ۿۣ�" + discount);
		System.out.println("Ӧ����" + zong * discount);
		System.out.print("ʵ�����Ϊ");
		payment = input.nextDouble();
		System.out.println("��Ǯ��" + (payment - zong * discount));
	}

}
