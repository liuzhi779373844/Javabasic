package java43_javabasic_chapter07_homework;

import java.util.Arrays;
import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		char [] character = new char[9];
		// char character[] = { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		Scanner input = new Scanner(System.in);
		System.out.println("��¼��8���ַ���");
		for (int i = 0; i < character.length - 1; i++) {
			character[i] = input.next().charAt(0);
		}
//		Arrays.sort(character);(��һ������δ��ֱֵ������Ļ��ͻ�������ݼ��٣��յ��Ǹ��ܵ���ǰ�棬���Ȳ������)
		System.out.print("ԭ�ַ����У�");
		for (int i = 0; i < character.length-1; i++) {
			System.out.print(character[i] + "\t");
		}
		System.out.print("\n��������ַ���:");

		char chs = input.next().charAt(0);

		// �ҵ������λ��
		int index = 0;
		for (int i = 0; i < character.length-1; i++) {
			if (chs < character[i]) {
				index = i;
				break;
			}
		}
		// Ԫ��λ�ú���
		for (int i = character.length - 1 ; i > index; i--) {
			character[i] = character[i - 1];
		}
		// ����
		character[index] = chs;
		// ѭ�����
		System.out.println("�������ַ�������:");
		for (int i = 0; i < character.length; i++) {
			System.out.print(character[i] + "\t");
		}
	}
}
