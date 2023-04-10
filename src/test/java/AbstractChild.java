
public class AbstractChild extends Abstract{

	

    String s;
	public AbstractChild() {
		super();
	
	System.out.println("child");
	
	
	}



	@Override
	public void method() {
    System.out.println(s);
		
	}
	


	public static void main(String args[])
	{
		AbstractChild obj=new AbstractChild();
		
		
	}

}
