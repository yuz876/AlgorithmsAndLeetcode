package review;
import review.Car;
import review.Sportcar;

public class runner {
	
	
	public static void main(String[] args) {
		System.out.println("Hello");
		Car car1 = new Car(); // object/instance
		Car car2 = new Car();	
		
		car1.forward();
		car2.forward();
//		car1.color = "red";
		
		Sportcar sc1 = new Sportcar();
		sc1.forward();
		sc1.fastrun();
//		sc1.load();
		
		Truck t1 = new Truck();
		t1.forward();
//		t1.fastrun();
		t1.load();
	}
}
