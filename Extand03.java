package Java43_javabasic_chpater05_homework;

import java.util.Scanner;

public class Extand03 {
	public static void main(String[] args) {
		// ������������ھ���1900��1��1���������졣
		// ע������ÿ���·�������һ����ʹ��while��do-while��
		/*
		 * ������ 1������¼��һ����ݣ�һ���·ݣ�һ������ 2��ѭ������1900��year-1 ��������� 3���ټ���year������ѹ���������
		 * 
		 * 
		 */
		// ��������¼��

		Scanner input = new Scanner(System.in);
		System.out.println("��������ѡ������(����1900��)��");
		int year = input.nextInt();
		System.out.println("�������·ݣ�1-12����");
		int month = input.nextInt();
		System.out.println("���������ڣ����ϵ��µĵ������������");
		int day = input.nextInt();
		int i = 1900;
		int days = 0;
		// ����year-1 ���ܹ�������
		while (i <= (year - 1)) {
			if ((i % 100 != 0 && i % 4 == 0) || i % 400 == 0) {
				days += 366;
			} else {
				days += 365;
			}
			i++;
		}

		// ����year�����������
		int days2 = 0;
		if ((i % 100 != 0 && i % 4 == 0) || i % 400 == 0) {
			switch (month - 1) {
			case 1:
				days2 = 31;
				break;
			case 2:
				days2 = 31 + 29;
				break;
			case 3:
				days2 = 31 + 29 + 31;
				break;
			case 4:
				days2 = 31 + 29 + 31 + 30;
				break;
			case 5:
				days2 = 31 + 29 + 31 + 30 + 31;
				break;
			case 6:
				days2 = 31 + 29 + 31 + 30 + 31 + 30;
				break;
			case 7:
				days2 = 31 + 29 + 31 + 30 + 31 + 30 + 31;
				break;
			case 8:
				days2 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
				break;
			case 9:
				days2 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				break;
			case 10:
				days2 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				break;
			case 11:
				days2 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				break;
			case 12:
				days2 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
				break;
			default:
			
				break;
			}
		} else {
			switch (month - 1) {
			case 1:
				days2 = 31;
				break;
			case 2:
				days2 = 31 + 28;
				break;
			case 3:
				days2 = 31 + 28 + 31;
				break;
			case 4:
				days2 = 31 + 28 + 31 + 30;
				break;
			case 5:
				days2 = 31 + 28 + 31 + 30 + 31;
				break;
			case 6:
				days2 = 31 + 28 + 31 + 30 + 31 + 30;
				break;
			case 7:
				days2 = 31 + 28 + 31 + 30 + 31 + 30 + 31;
				break;
			case 8:
				days2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
				break;
			case 9:
				days2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				break;
			case 10:
				days2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				break;
			case 11:
				days2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				break;
			case 12:
				days2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
				break;
			default:
				
				break;
			}

		}
		int totalDays = days + days2 + day - 1;
		System.out.println(year + "��" + month + "��" + day + "�յ�1900��1��1���ܹ��У�" + totalDays + "�졣");
	}

}
