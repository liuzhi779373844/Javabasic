package java43_javabasic_chapter06_homework;

public class ShortAnswerQuestion03 {
	public static void main(String[] args) {
		// FlipFlop��Ϸ��3�ı������Flip��5�ı������Flop������3�ı�������5�ı������FlipFlop��
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
