package testing;

public class CheseBoard {
	public static void main(String args[])
	{
		
		
		int a1=4,a2=4;
		int temp1=a1,temp2=a2;
		while(temp1<=8 && temp2<=8)
		{
			System.out.print(temp1+","+temp2+" ");
			temp1++;
			temp2++;
		}
		System.out.println();
		int temp3=a1-1,temp4=a2-1;
		while(temp3>=1 && temp4>=1)
		{
			
			System.out.print(temp3+","+temp4+" ");
			temp3--;
			temp4--;
			
		}
		System.out.println();
		int temp5=a1+1,temp6=a2-1;
		while(temp5<=8 && temp6>=1)
		{
			System.out.print(temp5+","+temp6+" ");
			temp5++;
			temp6--;
		
		}
		System.out.println();
		int temp7=a1-1,temp8=a2+1;
		while(temp7>=1 && temp8<=8)
		{
			
			System.out.print(temp7+","+temp8+" ");
			temp7--;
			temp8++;
	
		}
		
		
	}

}
