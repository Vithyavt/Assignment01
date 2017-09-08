
public class BigNumber {
public static void main(String arg[])
{
	int a=10,b=20,c=5;
	System.out.println("Largest of three numbers");
	if(a>b)
		if(a>c)
		{
			System.out.println("a is largest");
		}
		else
		{
			System.out.println("c is largest");
		}
	else if(b>c)
	{
		System.out.println("b is largest");
	}
	else
	{
		System.out.println("c is largest");
	}
}
}
