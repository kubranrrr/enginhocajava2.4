package classesWithAttributes;

public class Product {
	

	// attribute veya field = değişkenler
	private int id;
	String name;
	String description;
	double price;
	int stockAmount;
	String renk;
	String kod;

	// getter
	public int getId() {
		return id;
	}

	// setter
	public void setId(int id) {
		this.id = id;
		// this.id->product ın id si demek
		// alt çizgi olanlar field
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void set_description(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void set_price(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void set_stockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void set_renk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0,1) + id;
		//0'dan itibaren 1 e kadar 1 dahil degil
	}

	

}
