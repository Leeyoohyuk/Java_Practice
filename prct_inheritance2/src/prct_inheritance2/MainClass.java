package prct_inheritance2;

public class MainClass {
	public static void main(String[] args) {
		ParentClass[] parent = new ParentClass[2];
		parent[0] = new FirstClass();
		parent[1] = new SecondClass(); // ()
		
		((FirstClass)parent[0]).getOpenYear();
		// type casting
	}
}
