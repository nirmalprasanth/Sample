package Programs;

public class RevNum {
	public static void main(String args[])
	{
		int a=12345678;
		int n=0;
		
		while(a>0)
		{
			int b=a%10;
			a=a/10;
			n=b+(n*10);
		}
		System.out.println(n);
	}

}
