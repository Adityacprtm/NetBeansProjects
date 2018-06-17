package generic;

public class Tes {

    public static void main(String[] args) {
        Cupboard<Costume> a = new Cupboard<>(new Costume("Futsal", 10));
        a.show();
    }
}
