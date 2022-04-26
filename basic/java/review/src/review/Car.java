package review;

public class Car {
	// field/variable
	private String color;
	
	
	// constructor 1
	public Car(){
		this.color = "blue";
	}
	// constructor  2
	public Car(String inputcolor){
		this.color = inputcolor;
	}
	
	// methods
	public String getter() {
		return this.color;
	}
	
	public void setter(String color) {
		this.color = color;
	}
	
	public void forward() {
		System.out.println("Forward");
	}
	public void back() {
		System.out.println("Back");
	}
	
	
	
	
}
