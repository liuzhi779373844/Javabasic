package java43_javabasic_chapter06_homework;

public class Extand04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������������Ŀ������7�ף����ܰ�����3�ף�������׹2�ף�����������
		int count, num;
		for (count = 0, num = 0;;) {
			count++;
			num += 3;
			if (num >= 7) {
				break;
			}
			num -= 2;
		}
		System.out.println("���ܵ�" + count + "������7����ľ���");
	}

}
