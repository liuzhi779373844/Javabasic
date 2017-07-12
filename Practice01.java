package java43_javabasic_chapter06_homework;

public class Practice01 {

	public static void main(String[] args) {
		// 计算100以内的奇数之和

		int num = 0;
		int sum = 0;
		for (num = 1; num <= 100; num++) {
			sum += num;
		}
		System.out.println("100以内的奇数之和为：" + sum);
	}

}
