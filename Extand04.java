package Java43_javabasic_chpater05_homework;

import java.util.Scanner;

public class Extand04 {
	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����������");
		number = input.nextInt();
		//��int����ת�����ַ�������ת�����ַ�����
		/*String y = Integer.toString(number);
		//�ַ���ת��������
		//����һ����λ��
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
		//�����ַ���������������
		
		String str = new String(chs);
		int fanzhuan = Integer.valueOf(str);
		System.out.println("��ת֮������֣�"+fanzhuan);
	}
}
