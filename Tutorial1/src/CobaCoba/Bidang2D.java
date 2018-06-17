package CobaCoba;

public class Bidang2D {

    private double s;

    public Bidang2D(double s) {
        this.s = s;
    }

    public double getArea() {
        return (this.s * this.s);
    }

    public void cetak() {
        System.out.println(getArea());
    }
}
