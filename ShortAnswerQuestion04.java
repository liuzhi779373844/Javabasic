package java43_javabasic_chapter06_homework;

public class ShortAnswerQuestion04 {
	public static void main(String[] args) {
		int women = 0, men = 0, kid = 0;
		for (men = 0; men <= 10; men++) {
			for (women = 0; women <= 25; women++) {
				for (kid = 0; kid <= 30; kid++) {
					if (men + women + kid == 30 && 3 * men + 2 * women + kid == 50) {
						System.out.println("�ܹ�������" + men + "�ˣ�Ů��" + women + "�ˣ�С��" + kid + "��");
						return;
					}
				}
			}
		}	
	}
}
