package java43_javabasic_chapter06_homework;

public class Extand03 {
	public static void main(String[] args) {
		// ����2+22+222+222.����ǰ����ĺ�
		int num = 0;
		int sum = 0;
		for (int i = 1; i <= 8; i++) {
			num = num * 10 + 2;
			sum += num;
		}
		System.out.println("ǰ8���Ϊ��" + sum);
	}
}
