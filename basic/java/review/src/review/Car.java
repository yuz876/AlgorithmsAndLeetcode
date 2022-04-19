package review;

public class Car {
	private String color;
	
	
	
	public Car(){
		this.color = "blue";
	}
	public Car(String inputcolor){
		this.color = inputcolor;
	}
	
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
