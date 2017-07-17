package java43_javabasic_chapter07_homework;

import java.util.Scanner;

public class ShortAnswerQuestion06 {
	public static void main(String[] args) {
		// 简答题第6题，新歌插入
		String[] songs = new String[5];// {"Island","Ocean","Pretty","sun"};
		songs[0] = "Island";
		songs[1] = "Ocean";
		songs[2] = "Pretty";
		songs[3] = "sun";
		int index = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("插入前的数组为：");
		for (int i = 0; i < songs.length-1; i++) {
			System.out.print(songs[i] + "\t");
		}
		System.out.print("\n请输入歌曲名称：");
		String song = input.next();

		// 找到插入的位置,记得i是小于数组长度-1的
		for (int i = 0; i < songs.length - 1; i++) {
			if (song.compareToIgnoreCase(songs[i]) < 0) {
				index = i;
				break;
			}
		}
		// 后面的字符串后移
		for (int i = songs.length - 1; i > index; i--) {
			songs[i] = songs[i - 1];
		}

		// 插入
		songs[index] = song;

		// 输出
		System.out.print("插入后的数组为：");
		for (int i = 0; i < songs.length; i++) {
			System.out.print(songs[i] + "\t");
		}
	}
}
