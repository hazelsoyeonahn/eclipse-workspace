package exercises;

import java.text.NumberFormat;

public class Basket {
	private Purchase purchase[];
	private int nPurchase = 0;
	
	public Basket(int n){
		if (n <= 0) {
			n = 10;
		}
		this.purchase = new Purchase[n];
		nPurchase = n;
	}
	
	int x = 0;
	public void addPurchase(Purchase p) {
		if(!(x >= this.purchase.length)) {
			purchase[x] = p;
			++x;
		}
	}
	
	public int getNpurchases() {
		return nPurchase;
	}
	
	public Purchase getMostExpensive() {
		
		Purchase mostExpensive = this.purchase[0];
		for(int i = 0; i < this.purchase.length; ++i) {
			
			Purchase comparePrice = this.purchase[i];
			if(mostExpensive.getPrice() < comparePrice.getPrice()) {
				mostExpensive = comparePrice;
			}
		}
		return mostExpensive;
	}
	
	public Purchase[] getPurchases() {
		return purchase;
	}
	
	int y = 0;
	public double total(){
		double totalPurchase = 0;
		if(!(y >= this.purchase.length)) {
			for(int x = 0; x < purchase.length; ++x) {
				totalPurchase += purchase[y].getPrice();
				++y;
			}
		}
		return totalPurchase;
	}
	
	public void printReceipt() {
		System.out.println("Receipt:");
		
		x = 0;
		if(!(x >= this.purchase.length)) {
			for(int z = 0; z < purchase.length; ++z) {
				System.out.println(purchase[x]);
				++x;		
			}
		}
	}

}
