package java43_javabasic_Homework;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// /**
		// * ��ʵ�������ع������ϵͳ�ĵ�¼�˵�
		// * /

		System.out.println("\n\t\t��ӭʹ���������ع������ϵͳ1.0��\n");
		System.out.println("\t\t\t1����¼ϵͳ\n");
		System.out.println("\t\t\t2���˳�\n");
		System.out.println("***********************************************************");

		// ����¼����ѡ�������
		Scanner input = new Scanner(System.in);
		System.out.println("��ѡ���������֣�");
		/*
		 * int number = input.nextInt(); switch(number){ case 1: //��ʵϵͳ���˵�
		 * System.out.println("\n\t\t��ӭʹ���������ع�����ϵͳ\n");
		 * System.out.println("\t\t\t1�� �ͻ���Ϣ����\n");
		 * System.out.println("\t\t\t2�� �������\n");
		 * System.out.println("\t\t\t3�� �������\n");
		 * System.out.println("\t\t\t4�� ע��\n"); break; case 2: //�˳�ϵͳ
		 * System.out.println("лл����ʹ�ã�"); break; default:
		 * System.out.println("�������"); break; }
		 */
		if (input.hasNextInt()) {
			int number = input.nextInt();
			switch (number) {
			case 1:
				// ��ʵϵͳ���˵�
				System.out.println("\n\t\t��ӭʹ���������ع�����ϵͳ\n");
				System.out.println("\t\t\t1�� �ͻ���Ϣ����\n");
				System.out.println("\t\t\t2�� �������\n");
				System.out.println("\t\t\t3�� �������\n");
				System.out.println("\t\t\t4�� ע��\n");
				System.out.println("***********************************************************\n");
				System.out.println("���������ѡ��");
				if(input.hasNextInt()){
					int number2 = input.nextInt();
					switch(number2){
					case 1:
						System.out.println("�������ϵͳ>>�ͻ�����ϵͳ\n");
						System.out.println("\t\t\t1����ʾ���пͻ���Ϣ\n");
						System.out.println("\t\t\t2����ӿͻ���Ϣ\n");
						System.out.println("\t\t\t3���޸Ŀͻ���Ϣ\n");
						System.out.println("\t\t\t4����ѯ�ͻ���Ϣ\n");
						System.out.println("***********************************************************\n");
						break;
					case 3:
						System.out.println("\n�������ϵͳ>>�������\n");
						System.out.println("\t\t\t1�����˴����\n");
						System.out.println("\t\t\t2�����˳齱\n");
						System.out.println("\t\t\t3�������ʺ�\n");
						break;
					default:
						System.out.println("��δ���Ÿù��ܣ�");
						
					}
					
				}else{
					System.out.println("��������ȷ�����֣�");
				}
				break;
			case 2:
				// �˳�ϵͳ
				System.out.println("лл����ʹ�ã�");
				break;
			default:
				System.out.println("�������");
				break;
			}
		} else {
			System.out.println("��������ȷ�����֣�");
		}
	}

}
