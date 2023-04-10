package array;

public class ArrayExamples {

	public static void main(String args[])
	{
		
		
	//Array declaration
		int ar[];
		int []arr1;
		int[] arr2;
		
		char abc[];
		
	//array initialization
		int arr[]=new int[5];
		arr[0]=1;
		arr[1]=10;
		arr[2]=3;
		arr[3]=6;
		arr[4]=7;
		
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	
		//Array size	
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		char array[]= {'a','b','c'};
		
		int size=array.length;
		System.out.println(size);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		
		
		int marks[]= {10,70,40,30,5};
		
	//Array sorting
		
		int temp;
		for(int i=0;i<marks.length-1;i++)	
		{
			for(int j=i+1;j<marks.length;j++)
			{
				
				
				if(marks[i]<marks[j])
				{
					temp=marks[i];
					marks[i]=marks[j];
					marks[j]=temp;
				}
			}
		}
		System.out.println(marks[0]+" "+marks[1]+" "+marks[2]+" "+marks[3]+" "+marks[4]);
		
		
	}
}
