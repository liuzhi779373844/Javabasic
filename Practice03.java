package java43_javabasic_chapter06_homework;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ >�ͻ�����ϵͳ>��ӿͻ���Ϣ\n");
		int custNo = 0;
		String birthday;
		int point = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("�������Ա�ţ�4λ��������");
			custNo = input.nextInt();
			System.out.println("�������Ա���գ���/��<����λ������ʾ>����");
			birthday = input.next();
			System.out.println("�������Ա���֣�");
			point = input.nextInt();
			if (custNo > 9999 || custNo < 1000) {
				System.out.println("�ͻ���" + custNo + "����Ч��Ա��");
				System.out.println("¼����Ϣʧ�ܣ�");
				continue;
			}
			System.out.println("��¼�����ϢΪ��");
			System.out.println(custNo + " " + birthday + " " + point + "\n");
		}
		System.out.println("���������");
	}
}
