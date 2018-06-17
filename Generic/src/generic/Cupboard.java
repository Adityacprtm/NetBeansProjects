package generic;

public class Cupboard<T> {

    T item;

    public Cupboard(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void show() {
        System.out.println("Type cupboard : " + item.getClass());
    }
}
