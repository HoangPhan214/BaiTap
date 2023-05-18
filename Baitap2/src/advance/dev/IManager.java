package advance.dev;

import java.util.Comparator;
import java.util.List;

public interface IManager<T> {
	void add(T t);
    void remove(T t);
    void update(T t);
    List<T> getAll();
    void sort(Comparator<T> comparator);
}
