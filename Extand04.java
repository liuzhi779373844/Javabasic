package java43_javabasic_chapter07_homework;

public class Extand04 {
	public static void main(String[] args) {
		// 20*5�����飬ĳ��20�˵�5�ſγ̵ĳɼ�
		int[][] scores = new int[20][5];
		int[] totalScores = new int[20];// �洢20����ÿ�˵�5�ſγ̵��ܷ�
		int sumAll = 0;
		int sum = 0;
		double avg = 0;
		// ѭ������λ���鸳ֵ0-100������
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int) (Math.random() * 100);
			}
		}
		System.out.println("���\t" + "C++\t" + "Java\t" + "python\t" + "C#\t" + "C\t" + "�ܷ�");
		for (int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "\t");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
				totalScores[i] += scores[i][j];
				sum += scores[i][j];
			}
			sumAll += totalScores[i];
			System.out.println(totalScores[i]);
		}

		// û�ſγ̵��ܷ�
		System.out.print("�ܷ�:\t");
		int[] scores3 = new int[5];// 5�ſγ̵��ܷ�
		for (int i = 0; i < scores3.length; i++) {
			for (int j = 0; j < scores.length; j++) {
				scores3[i] += scores[j][i];
			}
			System.out.print(scores3[i] + "\t");
		}

		// ÿ�ſγ̵�ƽ����
		System.out.print("\nƽ���֣�\t");
		for (int i = 0; i < scores3.length; i++) {
			avg = scores3[i] * 1.0 / 20;
			System.out.print(avg + "\t");
		}
	}
}
