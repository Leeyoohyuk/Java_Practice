package prct_interface;

// using interface
public class InterfaceClass implements InterfaceA, InterfaceB{
	public InterfaceClass() {
		System.out.println("Interface class constructor");
	}
	
	@Override
	public void funA() { // Actually interface definition
		System.out.println("Function A operation");
	}
	
	@Override
	public void funB() {
		System.out.println("Function B operation");
	}
}
