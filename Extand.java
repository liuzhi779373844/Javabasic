package java43_javabasic_chapter07_homework;

import java.util.Arrays;

public class Extand {
	public static void main(String[] args) {
		// System.arraycopy(src, srcPos, dest, destPos, length);
		// ��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
		// System.arraycopy();�ô˷������������鸳ֵ��һ������
		int[] arr1 = { 1, 7, 9, 11, 13, 15, 17, 19 };
		int[] arr2 = { 2, 4, 6, 8, 10 };
		int newArrayLength = arr1.length + arr2.length;
		
		//����������
		int [] newArray=new int [newArrayLength];
		//���Ƶ�һ������
		System.arraycopy(arr1, 0, newArray, 0, arr1.length);
		//���Ƶڶ�������
		System.arraycopy(arr2,0, newArray, arr1.length, arr2.length);
		
		//��������
		Arrays.sort(newArray);
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]+" ");
		}
	}
}
