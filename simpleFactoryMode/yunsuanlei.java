package simpleFactoryMode;

//实现业务逻辑与页面逻辑分离


public class yunsuanlei {                                                
    //业务逻辑部分
	public static double GetResult(String operate,double numberA,double numberB){
		double result =0d;
		switch(operate)
		{
		case"+":
			result =numberA+numberB;
			break;
		case"-":
			result=numberA-numberB;
			break;
		case"*":
			result=numberA*numberB;
			break;
		case"/":
			result=numberA/numberB;
			break;
		}
		return result;
		}
	}

