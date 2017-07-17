package java43_javabasic_chapter07_homework;

public class ShortAnswerQuestion05copy04 {
	public static void main(String[] args) {
		// 简答题第5题//按照书本的做法

		int[] array = new int[] { 1, 3, -1, 5, -2 };
		int[] newArray = new int[5];
		System.out.println("原数组为：");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		// 逆序输入并判断是否小于0，小于0就极为0.
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] < 0) {
				continue;
			}
			newArray[array.length - 1 - i] = array[ i];
		}
		System.out.println("\n逆序并处理后的数组为：");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + "\t");
		}
	}
}
