package java43_javabasic_chapter06_homework;

public class ShortAnswerQuestion02 {
	public static void main(String[] args) {
		//����ͬ������
		int chookNum;
		int rabbitNum;
		
		for(chookNum=0,rabbitNum=35;chookNum<=35;chookNum++,rabbitNum--){
			if(chookNum+rabbitNum==35&&2*chookNum+4*rabbitNum==94){
				break;
			}
		}
		System.out.println("���У�"+chookNum+"ֻ��"+"������"+rabbitNum+"ֻ��");
		
	}
}
