package review;
import review.Car;
import review.Sportcar;
import review.SayHelloImplementation;
import review.MakeNoise;
import review.Didi;


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
		
		Car sc2 = new Sportcar();
		sc2.forward();
		
		int a = 1;
		
		SayHello1 h1 = new SayHelloImplementation();
		SayHelloImplementation h2 = new SayHelloImplementation();
		
		h1.hello();
		h2.hello();
		h1.hehe();
		
		SayHello2 h3 = new SayHelloImplementation();
		h3.hello2();
//		h3.hello(); h3 doesn't have methods from SayHello1
		SayHelloImplementation h4 = new SayHelloImplementation();
		h4.hello2();
		h4.hello(); //h4  have methods from SayHello1
		
		
		MakeNoise n1 = new Didi();
		n1.horn();
		n1.didi();
		
		Didi n2 = new Didi();
		n2.horn();
		n2.didi();
		
		
	}
}
