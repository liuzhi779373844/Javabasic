package java43_javabasic_chapter07_homework;

public class Extand01 {
	public static void main(String[] args) {
		// �������в�Ϊ��������洢��һ����������
		// ����ѭ��ͳ�Ƴ���Ϊ0��Ԫ�ض�������Ա�չ�����������飬
		int[] oldArray = { 1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5 };
		int count = 0;// ��¼0�ĸ���
		int index=0;//��¼����������
		// ͳ��0�ĸ���
		for (int i = 0; i < oldArray.length; i++) {
			if (oldArray[i] == 0) {
				count++;
			}
		}
		int newArrayLength = oldArray.length - count;
		// ����һ���µ����飬����ΪnewArrayLength
		int[] newArray = new int[newArrayLength];
		for (int i = 0; i < oldArray.length; i++) {
			if (oldArray[i]>0) {
				newArray[index]=oldArray[i];
				index++;
			}
		}
//		for(int i:newArray){
//			System.out.print(i+" ");
//		}
		System.out.println("������Ϊ��");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]+" ");
		}
	}
}
