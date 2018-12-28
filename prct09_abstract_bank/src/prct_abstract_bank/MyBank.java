package prct_abstract_bank;

public class MyBank extends Bank{
	public MyBank(String name, String account, int totalAccount) {
		super(name, account, totalAccount);
	}
	
	@Override
	public void installnewSaving() {
		System.out.println("install new saving");
	}
	
	@Override
	public void cancellation() {
		System.out.println("cancellation");
	}
}
