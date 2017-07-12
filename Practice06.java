package Java43_javabasic_chpater05_homework;


//计算1-50中的是7的倍数的数值之和。
public class Practice06 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		do{
			if(i % 7 == 0){
				sum = sum + i;
			}
			i++;
		}while(i<=50);
	System.out.println("1-50中是7的倍数的数值之和为："+sum);
	}
}
