
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, world!");
		
		Product p1;
		p1 = new Product();
		p1.setName("TV");
		p1.setPrice(123);
		p1.setTotalPrice(20);
		p1.printName();
		
		Product p2 = new Product();
		p2.setName("Wasmachine");
		p2.printName();
		
		String antwoord = p2.description();
		System.out.println("Antwoord = " + antwoord);
		
		Product p3 = new Product("Fiets");
	}

}
