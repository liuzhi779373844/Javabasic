package Java43_javabasic_chpater05_homework;

public class Extand01 {

	// ����1+2+������+99+100=�� ʹ��while�� do-whileʵ��
	//ѭ���ṹ��������һ�㲽��Ϊ��ȷ��ѭ��������ȷ��ѭ���壬Ȼ��д���������
	//ѭ���ṹ��������һ�㲽��Ϊ��ȷ��ѭ��������ȷ��ѭ���壬
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
		System.out.println("1-100�ĺ�Ϊ��" + sum);
	}

}
