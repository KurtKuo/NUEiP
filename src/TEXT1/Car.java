package TEXT1;

public class Car extends Vehicle implements Fallback{
	
	
	public Car() {
		
	}

	@Override
	public void move() {
		System.out.println("轎車也可以移動！");
	}
	
	@Override
	public void fallback() {
		// TODO Auto-generated method stub
		System.out.println("轎車才可以倒退！");
	}
	
}
