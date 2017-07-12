package Java43_javabasic_chpater05_homework;

public class Extand {
	public static void main(String[] args) {
		//一张纸的厚度大约为0.08mm，对折多少次之后能达到珠穆朗玛峰的高度8848.13m？使用while和do-while。
		
		double thick = 0.08;
		int count = 1;
		double height = 8848130;
		/*while(thick<=height){
			thick *= 2;
			count++;
		}*/
		
		do{
		thick *= 2;
		count++;
		}while(thick<=height);
		System.out.println("第"+count+"次折叠后能达到珠穆朗玛峰的高度!");
	}
}
