class Accounting{
	
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	Accounting(String num){
		System.out.println("No."+num+" Accounting");
	}
	public void print() {
		System.out.println("Value of suppy : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		System.out.println("Dividend1 : " + getDividend1());
		System.out.println("Dividend2 : " + getDividend2());
		System.out.println("Dividend3 : " + getDividend3());
	}

	private double getDividend1() {
		return getIncome() * 0.5;
	}

	private double getDividend2() {
		return getIncome() * 0.3;
	}
	
	private double getDividend3() {
		return getIncome() * 0.2;
	}
	
	private double getIncome() {
		return valueOfSupply - getExpense();
	}

	private double getExpense() {
		return valueOfSupply * expenseRate;
	}

	private double getTotal() {
		return valueOfSupply + getVAT();
	}

	private double getVAT() {
		return valueOfSupply * vatRate;
	}
}

public class AccountingClassApp {
	
	

	public static void main(String[] args) {

		/*
		 * Accounting.valueOfSupply = 10000.0; Accounting.vatRate = 0.1;
		 * Accounting.expenseRate = 0.3; Accounting.print();
		 */
		
		Accounting acc1 = new Accounting("1");
		acc1.valueOfSupply=10000.0;
		acc1.vatRate=0.1;
		acc1.expenseRate=0.3;
		acc1.print();
		
		System.out.println();
		
		Accounting acc2 = new Accounting("2");
		acc2.valueOfSupply=20000.0;
		acc2.vatRate=0.2;
		acc2.expenseRate=0.5;
		acc2.print();
		
	}
}
