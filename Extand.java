package java43_javabasic_chapter07_homework;

import java.util.Arrays;

public class Extand {
	public static void main(String[] args) {
		// System.arraycopy(src, srcPos, dest, destPos, length);
		// 从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
		// System.arraycopy();用此方法将两个数组赋值成一个数组
		int[] arr1 = { 1, 7, 9, 11, 13, 15, 17, 19 };
		int[] arr2 = { 2, 4, 6, 8, 10 };
		int newArrayLength = arr1.length + arr2.length;
		
		//定义新数组
		int [] newArray=new int [newArrayLength];
		//复制第一个数组
		System.arraycopy(arr1, 0, newArray, 0, arr1.length);
		//复制第二个数组
		System.arraycopy(arr2,0, newArray, arr1.length, arr2.length);
		
		//升序排列
		Arrays.sort(newArray);
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]+" ");
		}
	}
}
