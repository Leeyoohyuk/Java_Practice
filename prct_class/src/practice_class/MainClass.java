package practice_class;

public class MainClass {
	public static void main(String[] args) {
		Car mycar1 = new Car();
		mycar1.color = "red";
		mycar1.gear = "auto";
		mycar1.price = 100;
		
		mycar1.run();
		mycar1.stop();
		mycar1.info();
		
		Car mycar2 = new Car();
		mycar2.color = "yello";
		mycar2.gear = "auto";
		mycar2.price = 200;
		
		mycar2.run();
		mycar2.stop();
		mycar2.info();
		
		Bicycle mycycle = new Bicycle("blue", 100);
		mycycle.info();
	}
}
