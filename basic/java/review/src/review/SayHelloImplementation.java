package review;

public class SayHelloImplementation implements SayHello1, SayHello2{

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello!");
	}

	@Override
	public void hi() {
		// TODO Auto-generated method stub
		System.out.println("Hi!");
	}
	
	public void hey() {
		System.out.println("Hey!");
	}

	@Override
	public void hello2() {
		// TODO Auto-generated method stub
		System.out.println("Hello2222!");
	}

	@Override
	public void hi2() {
		// TODO Auto-generated method stub
		System.out.println("Hi2222!");
	}

}
