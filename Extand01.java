package java43_javabasic_chapter06_homework;

public class Extand01 {
	public static void main(String[] args) {
		// ��ӡ��Χ�ǵ�ˮ�ɻ�������λ���ֵ������͵��ڸ�������
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
