
public class Child implements ParentC {

		@Override
	public void methodA() {
		System.out.println("child class");
		
	}
	
		@Override
		public void car() {
		System.out.println("car");
			
		}

	public static void main(String args[])
	{
		Child c=new Child();
		c.methodA();
		c.car();
		
	}


	
}
