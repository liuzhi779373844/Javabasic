package java43_javabasic_chapter07_homework;

import java.util.Arrays;

public class Practice03 {
	public static void main(String[] args) {
		//×Ö·ûÄæĞòÊä³ö
		char character[]={'a','c','u','b','e','p','f','z'};
		System.out.print("Ô­×Ö·ûĞòÁĞ£º");
		for(int i=0;i<character.length;i++){
			System.out.print(character[i]+"\t");
		}
		//ÉıĞòÅÅĞò
		Arrays.sort(character);
		System.out.print("\nÉıĞòÅÅĞòºó£º");
		for(int i=0;i<character.length;i++){
			System.out.print(character[i]+"\t");
		}
		
		//ÄæĞòÊä³ö
		System.out.print("\nÄæĞòÅÅĞòºó£º");
		for(int i=character.length-1;i>=0;i--){
			System.out.print(character[i]+"\t");
		}
		
	}
}	
