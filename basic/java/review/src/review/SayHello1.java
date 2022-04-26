package review;

public interface SayHello1 {
	// interface is like rules
	void hello();
	void hi();
	
	// new feature
	default void hehe() {
		System.out.println("He he!");
	}
}
