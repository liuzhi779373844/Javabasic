package java43_javabasic_chapter06_homework;

public class Extand01 {
	public static void main(String[] args) {
		// 打印三围是的水仙花数，各位数字的立方和等于概述本身
		int i = 100;
		for (i = 100; i < 1000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100;
			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
				System.out.println(i);
			}
		}
	}
}
