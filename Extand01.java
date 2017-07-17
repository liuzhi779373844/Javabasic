package java43_javabasic_chapter07_homework;

public class Extand01 {
	public static void main(String[] args) {
		// 将数组中不为零的整数存储在一个新数组中
		// 首先循环统计出不为0的元素额个数，以便展开定义新数组，
		int[] oldArray = { 1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5 };
		int count = 0;// 记录0的个数
		int index=0;//记录新数组的序号
		// 统计0的个数
		for (int i = 0; i < oldArray.length; i++) {
			if (oldArray[i] == 0) {
				count++;
			}
		}
		int newArrayLength = oldArray.length - count;
		// 定义一个新的数组，长度为newArrayLength
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
		System.out.println("新数组为：");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]+" ");
		}
	}
}
