package Programs;

public class StringRev {
	public static void main(String args[])
	{
		String s="Prasanth";
	    String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		String word="I am prasanth";
		String arr[]=word.split(" ");
		String rev1="";
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				rev1=rev1+arr[i].charAt(j);
			}
			if(i!=arr.length-1)
			{
				rev1=rev1+" ";
			}
			
		}
		System.out.println(rev1);
	}

}
