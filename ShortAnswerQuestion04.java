package java43_javabasic_chapter07_homework;

public class ShortAnswerQuestion04 {
	public static void main(String[] args) {
		// 简答题第5题
		int[] array = new int[] { 1, 3, -1, 5, -2 };
		int[] newArray = new int[5];
		System.out.println("原数组为：");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		// 逆序输入并判断是否小于0，小于0就极为0.
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = array[array.length - 1 - i];
			if (newArray[i] < 0) {
				newArray[i] = 0;
			}
		}
		System.out.println("\n逆序并处理后的数组为：");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + "\t");
		}
	}
}
