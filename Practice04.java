package Java43_javabasic_chpater05_homework;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭʹ��MyShopping����ϵͳ\n");
		System.out.println("*****************************");
		System.out.println("\t\t1������ͻ�����ϵͳ");
		System.out.println("\t\t2���湺�����");
		System.out.println("\t\t3���������");
		System.out.println("\t\t4��ע��");
		System.out.println("*****************************\n");
		boolean isRight = true;
		
		do{
			System.out.println("��ѡ���������֣�");
			int number = input.nextInt();
			switch(number){
			case 1:
				System.out.println("ִ�пͻ�����ϵͳ");
				isRight = true;
				break;
			case 2:
				System.out.println("ִ�й������");
				isRight = true;
				break;
			 case 3:
				System.out.println("ִ���������");
				isRight = true;
				break;
			case 4:
				System.out.println("ע��");
				isRight = true;
				break;
			default:
				System.out.println("����������������ȷ�����֣�");
				isRight = false;
				break;
			}
		}while(isRight==false);
		
	System.out.println("���������");
	}
}
