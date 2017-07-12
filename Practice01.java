package Java43_javabasic_chpater05_homework;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//计算100以内的偶数之和
		int num = 0;//循环变量初始化
		int sum = 0;
		while(num<=100){
			sum += num;
			num = num +2;
			
		}
		System.out.println("100以内的偶数和为"+sum);
		
	}

}
