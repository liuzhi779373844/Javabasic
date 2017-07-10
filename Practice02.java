package java43_javabasic_Homework;

import java.util.Scanner;

public class Practice02 {
		public static void main(String[] args) {
			System.out.println("请输入消费金额：");
			Scanner input = new Scanner(System.in);
			double money = input.nextDouble();
			System.out.println("是否参加优惠回购活动：");
			System.out.println("1：满50元，加2元换购百事可乐饮料1瓶");
			System.out.println("2、满100元，加3元换购500ml可乐一瓶");
			System.out.println("3、满100元，加10元换购10kg面粉");
			System.out.println("4、满200元，加10元客换购1个苏珀尔炒菜锅");
			System.out.println("5、满200元，加20元客换购欧莱雅爽肤水一瓶");
			System.out.println("0、不换购");
			
		
			if(money>=200){
				System.out.print("请选择：");
				int choice = input.nextInt(); 
				switch(choice){
						case 1:
							money += 2;
							System.out.println("本次消费总金额："+money);
							System.out.println("成功换购：1瓶百事可乐。");
							break;
						case 2:
							money += 3;
							System.out.println("本次消费总金额："+money);
							System.out.println("成功换购：1瓶300ml的可乐。");
						case 3:
							money +=  10;
							System.out.println("本次消费总金额："+money);
							System.out.println("成功换购：1袋5kg的面粉。");
							break;
						case 4:
							money += 10;
							System.out.println("本次消费总金额："+money);
							System.out.println("成功换购：1个苏珀尔炒菜锅。");
							break;
						case 5:
							money += 20;
							System.out.println("本次消费总金额："+money);
							System.out.println("成功换购：1瓶欧莱雅爽肤水。");
							break;
						default:
							System.out.println("本次消费总金额："+money);
							System.out.println("不换购");
							break;
				}
			}
			else if(money>=100){
				System.out.println("请选择：");
				int choice = input.nextInt();
				switch(choice){
				case 1:
					money += 2;
					System.out.println("本次消费总金额："+money);
					System.out.println("成功换购：1瓶百事可乐。");
					break;
				case 2:
					money += 3;
					System.out.println("本次消费总金额："+money);
					System.out.println("成功换购：1瓶300ml的可乐。");
				case 3:
					money +=  10;
					System.out.println("本次消费总金额："+money);
					System.out.println("成功换购：1袋5kg的面粉。");
					break;
				default:
					System.out.println("不换购。");
					break;
				}
			}
			else if(money >= 50){
				System.out.println("请选择：");
				int choice = input.nextInt();
			switch(choice){
			case 1:
				money += 2;
				System.out.println("本次消费总金额："+money);
				System.out.println("成功换购：1瓶百事可乐。");
				break;
			default:
				System.out.println("不换购。");
				break;
			}
		}
			else{
				System.out.println("不换购。");
			}
		}
}
