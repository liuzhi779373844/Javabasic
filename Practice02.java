package java43_javabasic_Homework;

import java.util.Scanner;

public class Practice02 {
		public static void main(String[] args) {
			System.out.println("���������ѽ�");
			Scanner input = new Scanner(System.in);
			double money = input.nextDouble();
			System.out.println("�Ƿ�μ��Żݻع����");
			System.out.println("1����50Ԫ����2Ԫ�������¿�������1ƿ");
			System.out.println("2����100Ԫ����3Ԫ����500ml����һƿ");
			System.out.println("3����100Ԫ����10Ԫ����10kg���");
			System.out.println("4����200Ԫ����10Ԫ�ͻ���1����������˹�");
			System.out.println("5����200Ԫ����20Ԫ�ͻ���ŷ����ˬ��ˮһƿ");
			System.out.println("0��������");
			
		
			if(money>=200){
				System.out.print("��ѡ��");
				int choice = input.nextInt(); 
				switch(choice){
						case 1:
							money += 2;
							System.out.println("���������ܽ�"+money);
							System.out.println("�ɹ�������1ƿ���¿��֡�");
							break;
						case 2:
							money += 3;
							System.out.println("���������ܽ�"+money);
							System.out.println("�ɹ�������1ƿ300ml�Ŀ��֡�");
						case 3:
							money +=  10;
							System.out.println("���������ܽ�"+money);
							System.out.println("�ɹ�������1��5kg����ۡ�");
							break;
						case 4:
							money += 10;
							System.out.println("���������ܽ�"+money);
							System.out.println("�ɹ�������1����������˹���");
							break;
						case 5:
							money += 20;
							System.out.println("���������ܽ�"+money);
							System.out.println("�ɹ�������1ƿŷ����ˬ��ˮ��");
							break;
						default:
							System.out.println("���������ܽ�"+money);
							System.out.println("������");
							break;
				}
			}
			else if(money>=100){
				System.out.println("��ѡ��");
				int choice = input.nextInt();
				switch(choice){
				case 1:
					money += 2;
					System.out.println("���������ܽ�"+money);
					System.out.println("�ɹ�������1ƿ���¿��֡�");
					break;
				case 2:
					money += 3;
					System.out.println("���������ܽ�"+money);
					System.out.println("�ɹ�������1ƿ300ml�Ŀ��֡�");
				case 3:
					money +=  10;
					System.out.println("���������ܽ�"+money);
					System.out.println("�ɹ�������1��5kg����ۡ�");
					break;
				default:
					System.out.println("��������");
					break;
				}
			}
			else if(money >= 50){
				System.out.println("��ѡ��");
				int choice = input.nextInt();
			switch(choice){
			case 1:
				money += 2;
				System.out.println("���������ܽ�"+money);
				System.out.println("�ɹ�������1ƿ���¿��֡�");
				break;
			default:
				System.out.println("��������");
				break;
			}
		}
			else{
				System.out.println("��������");
			}
		}
}
