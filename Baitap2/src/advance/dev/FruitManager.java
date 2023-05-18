package advance.dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FruitManager implements IManager<Fruit> {
	private List<Fruit> fruits;

    public FruitManager() {
        fruits = new ArrayList<>();
    }

    @Override
    public void add(Fruit fruit) {
        fruits.add(fruit);
    }

    @Override
    public void remove(Fruit fruit) {
        fruits.remove(fruit);
    }

    @Override
    public void update(Fruit fruit) {
        int index = fruits.indexOf(fruit);
        if (index >= 0) {
            fruits.set(index, fruit);
        }
    }

    @Override
    public List<Fruit> getAll() {
        return new ArrayList<>(fruits);
    }

    @Override
    public void sort(Comparator<Fruit> comparator) {
        Collections.sort(fruits, comparator);
    }
}
