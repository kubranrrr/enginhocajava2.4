package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		
		product.setName("Laptop");
		product.setId(1);
		product.set_description("Asus laptop");
		product.set_price(5000);
		product.set_stockAmount(3);
				
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		
		

	}

}
