package Java43_javabasic_chpater05_homework;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		int min = 0;
		int max = 0;
		int number;
		Scanner input = new Scanner(System.in);
		/*do{
			System.out.println("������һ��������");
			number = input.nextInt();
			if(min>number){
				min = number;
			}
			if(max<number){
				max = number;
			}
		}while(number!=0);*/
		
		
		System.out.println("������һ��������");
		number = input.nextInt();
		min = number ;
		max = number;
		while(number!=0){	
			if(min>number){
				min = number;
			}
			if(max<number){
				max = number;
			}
			System.out.println("������һ��������");
			number = input.nextInt();
		}
		System.out.println("���ֵΪ��"+max+"����СֵΪ��"+min);
	}
}
