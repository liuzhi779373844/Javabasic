package java43_javabasic_Homework;

import java.util.Scanner;

public class SampleAnswerQuestion02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.println("请输入今天星期几（星期一至星期日）：");
			String week = input.next();
			switch(week){
				case "星期一":
				case "星期三":
				case "星期五":
					System.out.println("学习编程。");
					break;
				case "星期二":
				case "星期四":
				case "星期六":
					System.out.println("学习英语。");
					break;
				case "星期日":
					System.out.println("今天放假");
					break;
				default:
					System.out.println("你输入的这个星期只存在于火星！");
					break;
			}
	}

}
