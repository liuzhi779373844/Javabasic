package java43_javabasic_chapter06_homework;

public class Extand03 {
	public static void main(String[] args) {
		// 计算2+22+222+222.。。前八项的和
		int num = 0;
		int sum = 0;
		for (int i = 1; i <= 8; i++) {
			num = num * 10 + 2;
			sum += num;
		}
		System.out.println("前8项和为：" + sum);
	}
}
