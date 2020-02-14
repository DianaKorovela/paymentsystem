package lv.diana.employee;

import lv.diana.paysystem.Payee;

public class SalaryEmployee implements Payee {
	
	private String name;
	private Integer bankAccount; 
	protected Double grossWage; 
	
	

	public SalaryEmployee(String name, Integer bankAccount, Double grossWage) {
		this.name = name;
		this.bankAccount = bankAccount;
		this.grossWage = grossWage;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public Double grossPayment() {
		return grossWage;
	}

	@Override
	public Integer bankAccount() {
		return bankAccount;
	}

	@Override
	public boolean contains(Payee payee) {
		return false;
	}

	@Override
	public void add(Payee payee) {
		
	}
	

}
