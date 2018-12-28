package com.java.main;
import com.java.employeebank.*;

public class MainClass {
	public static void main(String[] args) {
		EmployeeBank park = new EmployeeBank("Park");
		park.saveMoney(300);
		
		EmployeeBank lee = new EmployeeBank("Lee");
		lee.saveMoney(100);
		lee.spendMoney(200);
		
		park.getBankInfo();
	}
}
