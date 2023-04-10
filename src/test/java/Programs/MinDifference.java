package Programs;

public class MinDifference {
	public static void main(String args[])
	{
		
		int a[]= {10,1,2,5,7,15,25};
		int temp;
		int min=9999;
		int first=0;
		int second = 0;
		
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]-a[j]<0)
			{
				temp=a[j]-a[i];
			}
			else
			{
				temp=a[i]-a[j];
			}
				if(temp<min)
				{
					first=a[i];
				    second=a[j];
					min=temp;
					
				}
			
		}}
		
		System.out.println(first+" "+second);
		
		
	}

}
