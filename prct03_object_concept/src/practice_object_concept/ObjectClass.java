package practice_object_concept;

public class ObjectClass {
	public int x;
	public int y;
	
	ObjectClass(){
	}
	
	public void getinfo() {
		System.out.println(" -- getInfo() -- ");
		System.out.println(" -- x -- " + x);
		System.out.println(" -- y -- " + y);
	}
	
	ObjectClass(int x, int y){
		this.x = x; // using 'this keyword'
		this.y = y;
	}
}
