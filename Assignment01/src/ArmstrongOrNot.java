
public class ArmstrongOrNot {
	public static void main(String arg[])
	{
		int a=0,b,temp;
		int num=678;
		temp=num;
		while (num>0)
		{
			b=num%10;
			num=num/10;
			a=a+(b*b*b);
		}
		if(temp==a)
			System.out.println("It is armstrong number");
		else
			System.out.println("It is not armstrong number");
		
	}

}
