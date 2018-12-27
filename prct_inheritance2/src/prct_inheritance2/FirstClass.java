package prct_inheritance2;

public class FirstClass extends ParentClass{
	int openyear = 2000;
	
	public FirstClass() {
		System.out.println("FirstClass Constructor");
	}
	public void Fun()
	{
		System.out.println("First");
	}
	public void getOpenYear() {
		System.out.println("Parent Open Year : " + super.openyear);
		System.out.println("First Child Open Year : " + this.openyear);
	}
}
