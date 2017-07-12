package java43_javabasic_chapter06_homework;

public class Extand04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 青蛙爬进的题目：井深7米，青蛙白天爬3米，晚上下坠2米；几天爬出；
		int count, num;
		for (count = 0, num = 0;;) {
			count++;
			num += 3;
			if (num >= 7) {
				break;
			}
			num -= 2;
		}
		System.out.println("青蛙第" + count + "天爬出7米深的井。");
	}

}
