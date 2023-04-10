
public class Car implements Vehicle {

	@Override
	public void  road() {
	System.out.println("Car");	
	}

	@Override
	public void bus() {
		System.out.println("bus");
		
	}
	
	
	public static void main(String args[])
	{
		Car c=new Car();
		c.road();
		
		
		System.out.println(Car.a);
	}

}
