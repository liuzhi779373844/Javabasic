package Java43_javabasic_chpater05_homework;


//����1-50�е���7�ı�������ֵ֮�͡�
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
	System.out.println("1-50����7�ı�������ֵ֮��Ϊ��"+sum);
	}
}
