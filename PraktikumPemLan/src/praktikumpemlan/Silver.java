package praktikumpemlan;

public class Silver extends Salon {

    private double total;
    private String freeProduct;

    public Silver(String nama, String anggota, double biaya, double product, String free) {
        super(nama, anggota, biaya, product);
        this.freeProduct = free;
    }

    public void setFreeProduct(String freeProduct) {
        this.freeProduct = freeProduct;
    }

    public void setDisc(double disc) {
        this.disc = disc;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFreeProduct() {
        return freeProduct;
    }

    public double getDisc() {
        return biaya - (biaya * 0.1);
    }

    public double getTotal() {
        return biaya - (biaya * 0.1) + product;
    }

    public void setProduct(double product) {
        product -= (0.1 * product);
        this.product = product;
    }

    public double getProduct() {
        return product;
    }

    public void display() {
        System.out.println("Nama pelanggan\t\t\t:" + super.getNama());
        System.out.println("Member\t\t\t\t:" + super.getAnggota());
        System.out.println("Biaya perawatan\t\t\t:" + super.getBiaya());
        System.out.println("Biaya perawatan setelah diskon\t:" + getDisc());
        System.out.println("Anda mendapatkan gratis\t\t:" + getFreeProduct());
    }

    public void totalPerawatan() {
        System.out.println("Harga product\t\t\t:" + getProduct());
        System.out.println("Harga product setelah diskon\t:" + super.getDiskon());
        System.out.println("Total biaya\t\t\t:" + getTotal());
    }
}
