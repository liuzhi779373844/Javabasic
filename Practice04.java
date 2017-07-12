package java43_javabasic_chapter06_homework;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		//定义三个变量，分别存储用户名、用户密码、和输入额用户次数；
		String name = "jim";
		int code = 123456;
		int i = 0;
		Scanner input =new  Scanner(System.in);
		
		for(i=1;i<=3;i++){
			System.out.println("\n请输入用户名：");
			name = input.next();
			System.out.println("请输入密码：");
			code = input.nextInt();
			if(name.equals("jim") && code == 123456){
				System.out.println("欢迎登陆MyShopping系统！");
				break;
			}else {
				int j = 3-i;
				System.out.println("输入错误！您还有"+j+"次机会！");
				if(j==0){
					System.out.println("对不起，您三次均输入错误！");
				}
			}
			
		}
		System.out.println("感谢使用本程序！");
	}
}
