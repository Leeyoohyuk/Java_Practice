package prct_abstract_bank;

public abstract class Bank {
	String name;
	String account;
	int totalAccount;
	
	public Bank() {
		System.out.println("Bank Constructor");
	}
	
	public Bank(String name, String account, int totalAccount) {
		System.out.println("Bank Constructor");
		
		this.name = name;
		this.account = account;
		this.totalAccount = totalAccount;
	}
	
	public void deposit() {
		System.out.println("deposit start");
	}
	
	public void withdraw() {
		System.out.println("withdraw start");
	}
	
	public abstract void installnewSaving();
	
	public abstract void cancellation();
	
	public void getInfo() {
		System.out.printf("Name : %s\n", name);
		System.out.printf("Account : %s\n", account);
		System.out.printf("Totalaccount : %d\n", totalAccount);
	}
}
