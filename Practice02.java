package Java43_javabasic_chpater05_homework;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ѭ������
		double shirtPrice = 245.0;
		double shoePrice = 570.0;
		double PadPrice = 320.0;
		
		System.out.println("MyShopping����ϵͳ > �������");
		System.out.println("\n**************************");
		System.out.println("��ѡ��ѡ������Ʒ��ţ�");
		System.out.println("1��T��\t2������Ь\t3��������");
		System.out.println("\n**************************");
		
		Scanner input = new Scanner(System.in);
		
		String reply = "y";
		while("y".equals(reply)){
			System.out.print("��������Ҫ��ѯ����Ʒ��ţ�");
			int number = input.nextInt();
			switch(number){
			case 1:
				System.out.println("T��\t��245.0");
				break;
			case 2:
				System.out.println("����Ь\t$570.0");
				break;
			case 3:
				System.out.println("������\t$320.0");
				break;
				default:
					System.out.println("���޴˻�������������");
				break;
					
			}
			System.out.print("�Ƿ������n/y����");
			reply = input.next();
			
			
		}
		System.out.println("�����������߰ɣ�");
		
	}

}
