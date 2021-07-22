package TEXT1;

public class test {
	
		public static void main(String args[])
		   {

			Vehicle scooter = new Scooter();
		    scooter.start();
		    scooter.move();	
		    
			System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝！");	
			
			Car car = new Car();
			car.start();
			car.move();
			car.fallback();
			
		   }
}
