package Interface;

public class SampleC extends SampleB {
	public void  methodI()
	 {
		System.out.println("Sample class I");
	 }
	
	
	public static void main(String args[])
	{
		
		SampleC obj = new SampleC();
		obj.methodA();
		obj.methodB();
		obj.methodC();
		obj.methodD();
		obj.methodE();
		obj.methodF();
		obj.methodG();
		obj.methodH();
		obj.methodI();

	}

}
