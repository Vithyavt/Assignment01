
public class ArmstrongNumber {
	 public static void main(String arg[]) 
     {
        int n,i,b,sum=0;
        System.out.println("Armstrong numbers from 100 to 500:");
        for(i=100;i<=500;i++)
        {
            n=i;
            while(n>0)
            {
                b=n%10;
                sum=sum+(b*b*b);
                n=n/10;
            }
            if(sum==i)
            {
                System.out.println(i+" ");
            }
            sum=0;
        }
    }
}
