package java43_javabasic_Homework;

import java.util.Scanner;

public class SampleAnswerQuestion02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.println("������������ڼ�������һ�������գ���");
			String week = input.next();
			switch(week){
				case "����һ":
				case "������":
				case "������":
					System.out.println("ѧϰ��̡�");
					break;
				case "���ڶ�":
				case "������":
				case "������":
					System.out.println("ѧϰӢ�");
					break;
				case "������":
					System.out.println("����ż�");
					break;
				default:
					System.out.println("��������������ֻ�����ڻ��ǣ�");
					break;
			}
	}

}
