package Programs;

public class PrimeNumber {
	public static void main(String args[])
	{
		boolean flag=true;
		int number=3;
		int n=number/2;
		if(number==0||number==1)
		{
			flag=false;
		}
		for(int i=2;i<=n;i++)
		{
			if(number%i==0)
			{
				flag=false;
				break;
			}
		}
		
		System.out.println(flag);
	}

}
