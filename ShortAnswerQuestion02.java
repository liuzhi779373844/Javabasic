package java43_javabasic_chapter07_homework;

public class ShortAnswerQuestion02 {
	public static void main(String[] args) {
		// 八位顾客积分的最低积分及它的原始位置
		int[] points = { 18, 25, 7, 36, 13, 2, 89,63 };
		int index = 0;// 存储最低分的原始位置
		int min = points[0];// 接受最低积分
		for (int i = 1; i < points.length; i++) {
			if (min > points[i]) {
				min = points[i];
				index = i + 1;
			}
		}
		System.out.println("最低积分为：" + min + ",它在第" + index + "个位置");
	}
}
