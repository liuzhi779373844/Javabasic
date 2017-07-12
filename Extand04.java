package Java43_javabasic_chpater05_homework;

import java.util.Scanner;

public class Extand04 {
	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		number = input.nextInt();
		//将int类型转换成字符串，再转换成字符数组
		/*String y = Integer.toString(number);
		//字符串转换成数组
		//或者一步到位：
		// 
		*/
		char [] chs = Integer.toString(number).toCharArray();
		
		int i=0;
		char temp;
		for(i=0;i<chs.length/2;i++){
			temp = chs[i];
			chs[i] = chs[chs.length-1-i];
			chs[chs.length-1-i] = temp;
			
		}
		//重新字符串，再生成数字
		
		String str = new String(chs);
		int fanzhuan = Integer.valueOf(str);
		System.out.println("反转之后的数字："+fanzhuan);
	}
}
