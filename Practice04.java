package java43_javabasic_chapter07_homework;

import java.util.Arrays;
import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		char [] character = new char[9];
		// char character[] = { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		Scanner input = new Scanner(System.in);
		System.out.println("请录入8个字符：");
		for (int i = 0; i < character.length - 1; i++) {
			character[i] = input.next().charAt(0);
		}
//		Arrays.sort(character);(有一个数据未赋值直接排序的话就会出错，数据减少，空的那个跑到最前面，长度不变就少)
		System.out.print("原字符序列：");
		for (int i = 0; i < character.length-1; i++) {
			System.out.print(character[i] + "\t");
		}
		System.out.print("\n待插入的字符是:");

		char chs = input.next().charAt(0);

		// 找到插入的位置
		int index = 0;
		for (int i = 0; i < character.length-1; i++) {
			if (chs < character[i]) {
				index = i;
				break;
			}
		}
		// 元素位置后移
		for (int i = character.length - 1 ; i > index; i--) {
			character[i] = character[i - 1];
		}
		// 插入
		character[index] = chs;
		// 循环输出
		System.out.println("插入后的字符序列是:");
		for (int i = 0; i < character.length; i++) {
			System.out.print(character[i] + "\t");
		}
	}
}
