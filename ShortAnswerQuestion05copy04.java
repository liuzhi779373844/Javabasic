package java43_javabasic_chapter07_homework;

public class ShortAnswerQuestion05copy04 {
	public static void main(String[] args) {
		// ������5��//�����鱾������

		int[] array = new int[] { 1, 3, -1, 5, -2 };
		int[] newArray = new int[5];
		System.out.println("ԭ����Ϊ��");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		// �������벢�ж��Ƿ�С��0��С��0�ͼ�Ϊ0.
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] < 0) {
				continue;
			}
			newArray[array.length - 1 - i] = array[ i];
		}
		System.out.println("\n���򲢴���������Ϊ��");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + "\t");
		}
	}
}
