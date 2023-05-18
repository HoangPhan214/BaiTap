package advance.dev;

public class Fruit {
	private String name;
	private int weight;
	private double price;
	public Fruit(String name, int weight, double price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
