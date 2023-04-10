
public class Chennai extends Medical  {
//if we declare any varible as final-constant
//cant override method
//cant inherit	
 final int a=20;
	public void dummy()
	{
//	a=30;
	System.out.println(a);
	}
	public void dummy2()
	{
//	a=40;
	}
/*	public void neuroDepartment()
	{
		
		System.out.println("Neuro department>>>>>>>>>>>>>>>");
	}*/
	
	
	public static void main(String args[])
	{
		Chennai fi=new Chennai();
		//Medical m=new Medical();
		//m.neuroDepartment();
		
		}
}
