package java43_javabasic_Homework;

import java.util.Scanner;

public class SampleAnswerQuestion03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的分数：");
		double score = input.nextDouble();
		
		int i = (int)score / 10;
		switch(i){
		case 10:
			System.out.println("父亲给刘珊珊买一辆车。");
			break;
		case 9:
		case 8:
		case 7:
			System.out.println("母亲给刘珊珊买一台笔记本电脑。");
			break;
		case 6:
		System.out.println("母亲给刘珊珊买一部手机。");
		break;
		default:
			System.out.println("没有礼物");
			break;
		}
		
	}

}
