package java43_javabasic_chapter07_homework;

import java.util.Scanner;

public class ShortAnswerQuestion03 {
	public static void main(String[] args) {
		//������¼��10���������Ϸ���Ϊ1��2/3������Ϊ�Ƿ�
		//�����������飬һ����¼���10�����ݣ�һ���ǳ���Ϊ4����¼�����Ϸ����ݵĸ���������
		//count[0]��¼1�ĸ������Դ�����
		int[]nums=new int[10];
		int[]count=new int[4];
		//¼��10����������
		Scanner input = new Scanner(System.in);
		//ѭ��¼��
		System.out.println("������10��������");
		for(int i=0;i<nums.length;i++){
			nums[i]=input.nextInt();
		}
		
		//ʹ��ѭ�����Ҳ���¼�Ϸ����ֵĸ���
		for(int i =0;i<nums.length;i++){
			switch(nums[i]){
			case 1:
				count[0]++;
				break;
			case 2:
				count[1]++;
				break;
			case 3:
				count[2]++;
				break;
			default:
				count[3]++;
				break;
			}
		}
		System.out.println("����1�ĸ���Ϊ��"+count[0]);
		System.out.println("����2�ĸ���Ϊ��"+count[1]);
		System.out.println("����3�ĸ���Ϊ��"+count[2]);
		System.out.println("�Ƿ����ֵĸ���Ϊ��"+count[3]);
	}
}
