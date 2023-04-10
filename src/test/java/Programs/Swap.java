package Programs;

public class Swap {
	public static void main(String args[])
	{
		String a="Nirmal";
		String b="Prasanth";
		a=a+b;
		b=a.substring(0,a.indexOf(b));
		a=a.substring(b.length());
		System.out.println(a+" "+b);
	}

}
