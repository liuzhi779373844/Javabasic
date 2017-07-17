package java43_javabasic_chapter07_homework;

public class Extand04 {
	public static void main(String[] args) {
		// 20*5的数组，某班20人的5门课程的成绩
		int[][] scores = new int[20][5];
		int[] totalScores = new int[20];// 存储20个人每人的5门课程的总分
		int sumAll = 0;
		int sum = 0;
		double avg = 0;
		// 循环给二位数组赋值0-100的整数
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int) (Math.random() * 100);
			}
		}
		System.out.println("序号\t" + "C++\t" + "Java\t" + "python\t" + "C#\t" + "C\t" + "总分");
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

		// 没门课程的总分
		System.out.print("总分:\t");
		int[] scores3 = new int[5];// 5门课程的总分
		for (int i = 0; i < scores3.length; i++) {
			for (int j = 0; j < scores.length; j++) {
				scores3[i] += scores[j][i];
			}
			System.out.print(scores3[i] + "\t");
		}

		// 每门课程的平均分
		System.out.print("\n平均分：\t");
		for (int i = 0; i < scores3.length; i++) {
			avg = scores3[i] * 1.0 / 20;
			System.out.print(avg + "\t");
		}
	}
}
