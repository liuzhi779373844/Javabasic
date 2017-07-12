package Java43_javabasic_chpater05_homework;

public class Extand01 {

	// 计算1+2+。。。+99+100=？ 使用while和 do-while实现
	//循环结构解决问题额一般步骤为：确定循环条件，确定循环体，然后写代码就行了
	//循环结构解决问题的一般步骤为：确定循环条件，确定循环体，
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		/*while (i <= 100) {
			sum += i;
			i++;
		}*/
		
		do{
			sum += i;
			i++;
		}while(i<=100);
		System.out.println("1-100的和为：" + sum);
	}

}
