import java.util.*;

/*
 * 1.������ͨ���û�����ֵ�仯�߶ȣ��û����룬�����в�����ȡ�� String->int int h = Integer.parseInt(args[0]);
 * 2.�ж��û���û�и����� exception
 * 3.���û������Ƿ����루�û�������A��B��C�ȣ���exception����catch��ӵĶ�������ͨ��������һ���������������������õ�exception
 *   NumberFormatException
 * 4.ʹ���Զ���exception:���û�û�и������в���ʱ���׳��Զ����쳣����catch���Զ���exception
 *   1)�Զ���һ��exception��
 *   2)ʹĳ��������ĳ������ʱ�׳�exception
 */
public class PrintTriangle {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * �������뷽����1.run-��run configurations->Arguments����
		 *          2.Scanner��
		 */		
//		int h=Integer.parseInt(args[0]);  //1
		Scanner hight = new Scanner(System.in); //2
		System.out.println("�����������θ߶���ֵ��");
		int h=hight.nextInt();
		
		/*δ�������exception*/
		try {
			h = Integer.parseInt(args[0]);
//			h = hight.nextInt();
			if(h==0) {
				System.out.println("δ����߶Ȳ�����");
			}
		}catch(ArrayIndexOutOfBoundsException e1) {			
			System.out.println("�����쳣Ϊ��"+e1);
		}
		
		/*����Ƿ�����exception*/
		try {
			h =  Integer.parseInt(args[0]);
//			h = hight.nextInt();
		}catch(InputMismatchException e2) {
			System.out.println("����Ƿ��߶Ȳ�����");
			System.out.println("�����쳣Ϊ��"+e2);
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
