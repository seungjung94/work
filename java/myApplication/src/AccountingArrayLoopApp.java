
public class AccountingArrayLoopApp {

	public static void main(String[] args) {

		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expenseRate = 0.3;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;

		double[] rates = new double[3];
		rates[0] = 0.5;
		rates[1] = 0.3;
		rates[2] = 0.2;

		System.out.println("Value of suppy : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);

		for (double rate : rates) {
			System.out.println("Dividend : " + income * rate);
		}
	}
}
