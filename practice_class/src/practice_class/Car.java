package practice_class;

public class Car {
	public String color;
	public String gear;
	public int price;
	
	public Car() {
		System.out.println("Constructor");
	}
	public void run() {
		System.out.println("--run--");
	}
	public void stop() {
		System.out.println("--stop--");
	}
	
	public void info() {
		System.out.println("-- info() --");
		System.out.println("color : " + color);
		System.out.println("gear : " + gear);
		System.out.println("price : " + price);
	}
}
