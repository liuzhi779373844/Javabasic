package java43_javabasic_chapter07_homework;

public class ShortAnswerQuestion02 {
	public static void main(String[] args) {
		// ��λ�˿ͻ��ֵ���ͻ��ּ�����ԭʼλ��
		int[] points = { 18, 25, 7, 36, 13, 2, 89,63 };
		int index = 0;// �洢��ͷֵ�ԭʼλ��
		int min = points[0];// ������ͻ���
		for (int i = 1; i < points.length; i++) {
			if (min > points[i]) {
				min = points[i];
				index = i + 1;
			}
		}
		System.out.println("��ͻ���Ϊ��" + min + ",���ڵ�" + index + "��λ��");
	}
}
