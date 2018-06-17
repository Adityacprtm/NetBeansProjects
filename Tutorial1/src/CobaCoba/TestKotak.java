package CobaCoba;

public class TestKotak {

    public static void main(String[] args) {
        Bidang2D box = new Kotak(5);
        box.cetak();
        box = new Bidang2D(20);
        box.cetak();
    }
}
