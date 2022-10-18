package simpleFactoryMode;

import java.util.*;

public class kehuduan {

	public static void main(String arg[])
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("请输入第一个数字");
		double numberA=cin.nextDouble();
		
		Scanner cin2=new Scanner(System.in);
		System.out.println("请输入一个运算符");
		String operate=cin2.next();
		
		Scanner cin3=new Scanner(System.in);
		System.out.println("请输入第二个数字");
		double numberB=cin3.nextDouble();
		
		double strResult=yunsuanlei.GetResult(operate, numberA, numberB);
		System.out.println("结果为"+strResult);
		
		cin.close();
		cin2.close();
		cin3.close();
	}
}
