package prct_abstract_bank;

public class MainClass {
	public static void main(String[] args) {
		Bank mybank = new MyBank("¿Ã¿Ø«ı", "123-123", 30000);
		
		mybank.deposit();
		mybank.withdraw();
		mybank.installnewSaving();
		mybank.cancellation();
		
		System.out.println();
		mybank.getInfo();
	}
}
