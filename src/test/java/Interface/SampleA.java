package Interface;

public class SampleA  extends AbstractC{
	public void  methodG()
	 {
		System.out.println("Sample class A");
	 }

	@Override
	public void methodC() {
		System.out.println("Interface C");
	}

	@Override
	public void methodB() {
		System.out.println("Interface B");
	}

	@Override
	public void methodA() {
		System.out.println("Interface A");
		
	}

}
