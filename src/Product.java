// Ckass
public class Product {
	// Property
	private String name;
	
	private int price;
	
	private int totalPrice;
	
	public Product () {
		System.out.println("In constructor");
		price = 10;
	}
	
	public Product(String name) {
		System.out.println("In constructor met naam" + name);
		this.name = name;
	}
	
	public void printName() {
		System.out.println("Naam is " + name);
	}
	
	public void defineName( String name ) {
		this.name = name;
	}
	
	public String description() {
		
		String a = "Naam is " + name + "en prijs is " + price;
		return a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price <= 10000000)
			this.price = price;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	

}
