//Mobile class
class Mobile {
	int id;
	String brand;
	String model;
	double price;
	int stock;
	Mobile(int id, String brand, String model, double price, int stock) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.stock = stock;
	}
	public String toString() {
		return "ID: " + id + ", " + brand + " " + model + ", Price: ■" + price + ", Stock: " + stock ;
	}
}
