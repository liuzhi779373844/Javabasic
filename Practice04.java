package java43_javabasic_chapter06_homework;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		//���������������ֱ�洢�û������û����롢��������û�������
		String name = "jim";
		int code = 123456;
		int i = 0;
		Scanner input =new  Scanner(System.in);
		
		for(i=1;i<=3;i++){
			System.out.println("\n�������û�����");
			name = input.next();
			System.out.println("���������룺");
			code = input.nextInt();
			if(name.equals("jim") && code == 123456){
				System.out.println("��ӭ��½MyShoppingϵͳ��");
				break;
			}else {
				int j = 3-i;
				System.out.println("�������������"+j+"�λ��ᣡ");
				if(j==0){
					System.out.println("�Բ��������ξ��������");
				}
			}
			
		}
		System.out.println("��лʹ�ñ�����");
	}
}
