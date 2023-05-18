package advance.dev;

import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitManager fruitManager = new FruitManager();

		//Them fruit
		Fruit apple = new Fruit("Apple", 10, 0.5);
		Fruit banana = new Fruit("Banana", 5, 0.2);
		Fruit orange = new Fruit("Orange", 7, 0.9);
		fruitManager.add(apple);
		fruitManager.add(banana);
		fruitManager.add(orange);

		//Sua fruit
		Fruit newApple = new Fruit("Apple", 10, 9);
		fruitManager.update(newApple);

		//Xoa fruit
		fruitManager.remove(banana);

		//Lay ra toan bo
		List<Fruit> allFruits = fruitManager.getAll();
		for (Fruit fruit : allFruits) {
			System.out.println(
					"Name: " + fruit.getName() + ", Weight: " + fruit.getWeight() + ", Price: " + fruit.getPrice());
		}

		//Sap xep fruit
		fruitManager.sort(Comparator.comparing(Fruit::getPrice).reversed());

		//Lay tat ca sau khi sap xep
		allFruits = fruitManager.getAll();
		for (Fruit fruit : allFruits) {
			System.out.println(
					"Name: " + fruit.getName() + ", Weight: " + fruit.getWeight() + ", Price: " + fruit.getPrice());
		}
	}
}
