package java43_javabasic_chapter07_homework;

import java.util.Arrays;

public class Practice03 {
	public static void main(String[] args) {
		//�ַ��������
		char character[]={'a','c','u','b','e','p','f','z'};
		System.out.print("ԭ�ַ����У�");
		for(int i=0;i<character.length;i++){
			System.out.print(character[i]+"\t");
		}
		//��������
		Arrays.sort(character);
		System.out.print("\n���������");
		for(int i=0;i<character.length;i++){
			System.out.print(character[i]+"\t");
		}
		
		//�������
		System.out.print("\n���������");
		for(int i=character.length-1;i>=0;i--){
			System.out.print(character[i]+"\t");
		}
		
	}
}	
