package java43_javabasic_chapter07_homework;

import java.util.Scanner;

public class ShortAnswerQuestion03 {
	public static void main(String[] args) {
		//键盘上录入10个整数，合法的为1、2/3，其他为非法
		//定义两个数组，一个是录入的10个数据，一个是长度为4，记录各个合法数据的个数的数组
		//count[0]记录1的个数，以此类推
		int[]nums=new int[10];
		int[]count=new int[4];
		//录入10个整数数据
		Scanner input = new Scanner(System.in);
		//循环录入
		System.out.println("请输入10个整数：");
		for(int i=0;i<nums.length;i++){
			nums[i]=input.nextInt();
		}
		
		//使用循环查找并记录合法数字的个数
		for(int i =0;i<nums.length;i++){
			switch(nums[i]){
			case 1:
				count[0]++;
				break;
			case 2:
				count[1]++;
				break;
			case 3:
				count[2]++;
				break;
			default:
				count[3]++;
				break;
			}
		}
		System.out.println("数字1的个数为："+count[0]);
		System.out.println("数字2的个数为："+count[1]);
		System.out.println("数字3的个数为："+count[2]);
		System.out.println("非法数字的个数为："+count[3]);
	}
}
