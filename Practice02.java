package java43_javabasic_chapter06_homework;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int young = 0;//记录三十岁以下的客户数
		int age =0;//保存客户的年龄
		for(int i =1;i<11;i++){
			System.out.println("请输入第"+i+"位客户的年龄：");
			age = input.nextInt();
			if(age<30){
				continue;
			}else{
				young++;
			}
		}
		System.out.println("30岁以上的比率为："+young/10.0*100+"%");
		System.out.println("30岁以上的比率为："+(1-young/10.0)*100+"%");
	}

}
