package java43_javabasic_Homework;

import java.util.Scanner;

public class SampleAnswerQuestion03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("��������ķ�����");
		double score = input.nextDouble();
		
		int i = (int)score / 10;
		switch(i){
		case 10:
			System.out.println("���׸���ɺɺ��һ������");
			break;
		case 9:
		case 8:
		case 7:
			System.out.println("ĸ�׸���ɺɺ��һ̨�ʼǱ����ԡ�");
			break;
		case 6:
		System.out.println("ĸ�׸���ɺɺ��һ���ֻ���");
		break;
		default:
			System.out.println("û������");
			break;
		}
		
	}

}
