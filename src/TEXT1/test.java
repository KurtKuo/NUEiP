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
			
			/**********************************************************************************
			*			  相同之處，兩者皆是繼承交通工具Vehicle，並且繼承發動start()這個功能			  *
			*			  				  													  *
			*			  不同之處，介面是多重繼承的概念，並且對功能的描述							  *
			*			  我這邊 創立一個屬於汽車才有的倒退Fallback介面							  *
			*			  利用Car類別去實作這個方法，implement 介面的類別一定要實作它的抽象方法		  *
			***********************************************************************************/
			
		   }
}
