package java43_javabasic_chapter06_homework;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int young = 0;//��¼��ʮ�����µĿͻ���
		int age =0;//����ͻ�������
		for(int i =1;i<11;i++){
			System.out.println("�������"+i+"λ�ͻ������䣺");
			age = input.nextInt();
			if(age<30){
				continue;
			}else{
				young++;
			}
		}
		System.out.println("30�����ϵı���Ϊ��"+young/10.0*100+"%");
		System.out.println("30�����ϵı���Ϊ��"+(1-young/10.0)*100+"%");
	}

}
