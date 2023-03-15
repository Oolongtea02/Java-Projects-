
	public class Candy implements DessertItem {
		private double weight;
		private int pricePerPound;		// in cents

		private String name;
		
		public Candy(String cname, double weight, int pricePerPound) {
			//super();
			this.name = cname;
			this.pricePerPound = pricePerPound;
			this.weight = weight;
		}
		
		public int getCost() {
			int cost = (int)(this.weight * this.pricePerPound);
			return cost;
		}
		
		public int getPricePerPound() {
			return pricePerPound;
		}
		
		public double getWeight() {
			return weight;
		}

		public String getName() {
			// TODO Auto-generated method stub
			return name;
		}

		
		public String getReceiptDescription() {
			// TODO Auto-generated method stub
			String a = this.weight + " lbs. @ " + DessertShoppe.cents2dollarsAndCents(this.pricePerPound) + " /lb.\n" + DessertShoppe.fillToMaxItemSize(name);
			return a + "\t";
		}
	}

