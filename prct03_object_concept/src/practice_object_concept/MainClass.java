package practice_object_concept;

public class MainClass {
	public static void main(String[] args) {
		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass();
		obj1.getinfo();
		
		obj1 = null; // reference remove
		//after some, garbage collector operating
		//but, reference 'obj1' isn't removed -> reusable 
		//obj1.getinfo(); -- impossible
		obj1 = new ObjectClass(3, 5);
		
		obj1.getinfo();
		obj2.getinfo(); // It's possible <- individual object
	}
}
