package java43_javabasic_chapter07_homework;

public class Extand03 {
	public static void main(String[] args) {
		//��͡����ֵ����Сֵ
		int [] nums={22,11,33,15,23,12,14,55};
		int max=nums[0];
		int min=nums[0];
		int sum=0;
		//���
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		//�����ֵ����Сֵ
		for (int i = 1; i < nums.length; i++) {
			if(min>nums[i]){
				min=nums[i];
			}
			if(max<nums[i]){
				max=nums[i];
			}
		}
		System.out.println("����ĺ͡����ֵ����Сֵ�ֱ�Ϊ��"+sum+","+max+","+min+"��");
	}
}
