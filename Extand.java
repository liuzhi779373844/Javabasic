package Java43_javabasic_chpater05_homework;

public class Extand {
	public static void main(String[] args) {
		//һ��ֽ�ĺ�ȴ�ԼΪ0.08mm�����۶��ٴ�֮���ܴﵽ���������ĸ߶�8848.13m��ʹ��while��do-while��
		
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
		System.out.println("��"+count+"���۵����ܴﵽ���������ĸ߶�!");
	}
}
