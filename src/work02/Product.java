package work02;

public class Product {
	private String name;
	private int price;
	
	Product(String name, int price){
		this.name=name;
		this.price=price;
	}
	
	public void printPrice() {
		System.out.println(this.name+": ê≈î≤Ç´ "+this.price+", ê≈çûÇ› "+this.price*108/100);
	}
}
