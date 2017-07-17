package java43_javabasic_chapter07_homework;

public class Practice01 {
	public static void main(String[] args) {
//		String goods[]=new String [5];
//		String goodss[]= new String[]{"我","爱","你"};
//		String goodsss[]={"ha","ha","ha"};
		String []goods=new String [5];
		String []goodss= new String[]{"我","爱","你"};
		String []goodsss={"ha","ha","ha"};
		goods[0]="Nike背包";
		goods[1]="Adidas运动衫";
		goods[2]="李宁运动鞋";
		goods[3]="Kappa外套";
		goods[4]="361°腰包";
		System.out.println("背刺获得特价商品有：");
		for(int i=0;i<goods.length;i++){
			System.out.println(goods[i]);
		}
		
	}
}
