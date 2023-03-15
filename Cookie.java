
public class Cookie implements DessertItem {
	private int number;
	private int pricePerDozen;
	private int cost;
	private String name;
	
	public Cookie(String cname, int number, int cpricePerDozen) {
		this.pricePerDozen = cpricePerDozen;
		this.number = number;
		this.name = cname;
	}
	
	public int getCost() {
		cost = (int)(number / 12.0 * pricePerDozen);
		return cost;
	}
	
	public int getPricePerDozen() {
		return this.pricePerDozen;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	
	public String getReceiptDescription() {
		// TODO Auto-generated method stub
		String a = this.number + " @ " + DessertShoppe.cents2dollarsAndCents(this.pricePerDozen) + " /dz.\n" + DessertShoppe.fillToMaxItemSize(name);
		return a;
	}
	
	

}
