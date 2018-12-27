package prct_anonymous;

public class MainClass {
	public static void main(String[] args) {
		new Anonymous() { // It's impossible to object recycle
			public void method() {
				System.out.println("Redefinition");
			};
		}.method(); // use to method redefinition
	}
}
