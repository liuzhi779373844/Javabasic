package java43_javabasic_chapter07_homework;

public class Practice01 {
	public static void main(String[] args) {
//		String goods[]=new String [5];
//		String goodss[]= new String[]{"��","��","��"};
//		String goodsss[]={"ha","ha","ha"};
		String []goods=new String [5];
		String []goodss= new String[]{"��","��","��"};
		String []goodsss={"ha","ha","ha"};
		goods[0]="Nike����";
		goods[1]="Adidas�˶���";
		goods[2]="�����˶�Ь";
		goods[3]="Kappa����";
		goods[4]="361������";
		System.out.println("���̻���ؼ���Ʒ�У�");
		for(int i=0;i<goods.length;i++){
			System.out.println(goods[i]);
		}
		
	}
}
