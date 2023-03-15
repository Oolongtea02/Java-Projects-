import java.util.ArrayList;

public class Checkout {
	
	//private final int RECEIPT_WIDTH = 17;
	private ArrayList<DessertItem> cashRegister = new ArrayList<DessertItem>(); 
	
	//public static void main(String[] args) {
		//System.out.println(sp.name);
	//}
	

	public int numberOfItems() {
		return cashRegister.size();

	}
	
	public void enterItem(DessertItem item) {
		this.cashRegister.add(item);
	}
	
	public void clear() {
		this.cashRegister.clear();
	}
	
	public int totalCost() {
		int sum = 0;
		for(int i = 0; i < cashRegister.size(); i++) 
			sum += cashRegister.get(i).getCost(); 
		return sum;
	}
	
	public int totalTax() {
		return (int)(this.totalCost() * DessertShoppe.TAX_RATE / 100.00);
	}
	
	public String toString() {
	
		String s = "	" + DessertShoppe.STORE_NAME + "\n";
		s += "	" + "--------------------" + "\n\n";
		int sum = 0;
		for(int i = 0; i < cashRegister.size(); i++){
			 s += cashRegister.get(i).getReceiptDescription() + "\t"; 
			
			String p = DessertShoppe.cents2dollarsAndCents(cashRegister.get(i).getCost());	// price of every item
			if (p.length() > DessertShoppe.COST_WIDTH)		// verify the price is within length
				p = p.substring(0, DessertShoppe.COST_WIDTH);
			
			s += p +"\n";		
	
		}
		
		String line = "\nTax:\t\t";		
		String tax = DessertShoppe.cents2dollarsAndCents(this.totalTax());	// print tax
		//while(line.length() <= RECEIPT_WIDTH - tax.length())
		//	line += " ";
		s += line + tax;
		
		String totalCost = DessertShoppe.cents2dollarsAndCents(this.totalCost() + this.totalTax());	// print total cost
		line = "\nTotal Cost:\t";
		//while(line.length() <= RECEIPT_WIDTH - totalCost.length())
		//	line += " ";
		s += line + totalCost;
		return s;
	}
}

