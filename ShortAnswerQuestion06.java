package java43_javabasic_chapter07_homework;

import java.util.Scanner;

public class ShortAnswerQuestion06 {
	public static void main(String[] args) {
		// ������6�⣬�¸����
		String[] songs = new String[5];// {"Island","Ocean","Pretty","sun"};
		songs[0] = "Island";
		songs[1] = "Ocean";
		songs[2] = "Pretty";
		songs[3] = "sun";
		int index = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("����ǰ������Ϊ��");
		for (int i = 0; i < songs.length-1; i++) {
			System.out.print(songs[i] + "\t");
		}
		System.out.print("\n������������ƣ�");
		String song = input.next();

		// �ҵ������λ��,�ǵ�i��С�����鳤��-1��
		for (int i = 0; i < songs.length - 1; i++) {
			if (song.compareToIgnoreCase(songs[i]) < 0) {
				index = i;
				break;
			}
		}
		// ������ַ�������
		for (int i = songs.length - 1; i > index; i--) {
			songs[i] = songs[i - 1];
		}

		// ����
		songs[index] = song;

		// ���
		System.out.print("����������Ϊ��");
		for (int i = 0; i < songs.length; i++) {
			System.out.print(songs[i] + "\t");
		}
	}
}
