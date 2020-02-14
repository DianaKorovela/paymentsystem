package lv.diana.paysystem;

public interface Payee {
	
	String name();
	Double grossPayment();
	Integer bankAccount();
	
	boolean contains(Payee payee);
	void add(Payee payee);
	
	

}
