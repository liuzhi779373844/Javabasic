package java43_javabasic_chapter06_homework;

public class ShortAnswerQuestion03 {
	public static void main(String[] args) {
		// FlipFlop游戏，3的倍数输出Flip，5的倍数输出Flop，既是3的倍数又是5的倍数输出FlipFlop。
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				System.out.println("Flip");
			} else if (i % 3 != 0 && i % 5 == 0) {
				System.out.println("Flop");
			} else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FlipFlop");
			} else {
				System.out.println(i);
			}
		}
	}
}
