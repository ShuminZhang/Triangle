import java.util.*;

/*
 * 1.三角形通过用户给定值变化高度（用户输入，命令行参数获取） String->int int h = Integer.parseInt(args[0]);
 * 2.判断用户若没有给参数 exception
 * 3.若用户给定非法输入（用户输入了A、B、C等）做exception处理，catch后接的东西可以通过发生过一次这个意外在命令解释器得到exception
 *   NumberFormatException
 * 4.使用自定义exception:当用户没有给命令行参数时，抛出自定义异常，再catch到自定义exception
 *   1)自定义一个exception类
 *   2)使某方法满足某种条件时抛出exception
 */
public class PrintTriangle {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * 两种输入方法：1.run-》run configurations->Arguments输入
		 *          2.Scanner类
		 */		
//		int h=Integer.parseInt(args[0]);  //1
		Scanner hight = new Scanner(System.in); //2
		System.out.println("请输入三角形高度数值：");
		int h=hight.nextInt();
		
		/*未输入参数exception*/
		try {
			h = Integer.parseInt(args[0]);
//			h = hight.nextInt();
			if(h==0) {
				System.out.println("未输入高度参数！");
			}
		}catch(ArrayIndexOutOfBoundsException e1) {			
			System.out.println("触发异常为："+e1);
		}
		
		/*输入非法参数exception*/
		try {
			h =  Integer.parseInt(args[0]);
//			h = hight.nextInt();
		}catch(InputMismatchException e2) {
			System.out.println("输入非法高度参数！");
			System.out.println("触发异常为："+e2);
		}
		
		for(int i = 0;i<h;i++) {
			for(int j = 0;j < h-i;j++) {
				System.out.print(" ");
			}
			for(int k = 0;k <= 2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
