package lv.diana.paysystem;

import java.util.ArrayList;
import java.util.List;

public class PaymentSystem {

	private List<Payee> payees;

	public PaymentSystem(ArrayList<Object> payees) {
		payees = new ArrayList<>();
	}
	
	public void addPayer (Payee payee){
		if(payee.contains(payee)){
			payee.add(payee);
	
		}
	}
	public void processPayments(){
		for(Payee payee : payees);
		Double grossPayment = payee.grossPayment();
		
		System.out.println("Paying to "+payee.name());
		System.out.println("Gross " +grossPayment);
		System.out.println("Transfered to Account " +payee.bankAccount());
		
	}
}
