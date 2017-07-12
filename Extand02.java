package Java43_javabasic_chpater05_homework;

public class Extand02 {
	public static void main(String[] args) {
		//1-10µÄ½×³Ë
		int i = 1;
		int number=1;
		/*while(i<=10){
			number *= i;
			i++;
		}*/
		
		do{
			number *= i;
			i++;
		}while(i<=10);
		System.out.println("10µÄ½×³ËÎª£º"+number);
	}
}
