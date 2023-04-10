package Programs;

public class LargestSmallest {
	public static void main(String args[])
	{

	int a[]= {1,3,5,-5,-7,10,0};
	
	int min=a[0];
	int max=a[0];
	
	for(int i=0;i<a.length;i++)
	{
		if(min>a[i])
		{
			min=a[i];
		}
		if(max<a[i])
		{
			max=a[i];
		}
	}
	System.out.println(min+" "+max);
	
}
}