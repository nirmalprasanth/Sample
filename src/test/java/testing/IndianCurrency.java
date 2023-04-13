package testing;

public class IndianCurrency {
	public static void main(String args[])
	{
		
		int n=2897;
		
		int r2000=n/2000;
		n=n%2000;
		
		int r500=n/500;
		n=n%500;
		
		int r200=n/200;
		n=n%200;
		
		int r100=n/100;
		n=n%100;
		
		int r50=n/50;
		n=n%50;
		
		int r20=n/20;
		n=n%20;
		
		int r10=n/10;
		n=n%10;
		
		int r5=n/5;
		n=n%5;
		
		int r2=n/2;
		n=n%2;
		
		int r1=n/1;
		
		System.out.println(r2000+" "+r500+" "+r200+" "+r100+" "+r50+" "+r20+" "+r10+" "+r5+" "+r2+" "+r1);
		
		
	}

}
