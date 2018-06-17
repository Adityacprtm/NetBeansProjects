package praktikumpemlan;

public class nonMember extends Salon {

    private double total;
    private double disc;

    public nonMember(String nama, String anggota, double biaya, double product) {
        super(nama, anggota, biaya, product);
    }

    public void setDisc(double disc) {
        this.disc = disc;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDisc() {
        return biaya;
    }

    public double getTotal() {
        return biaya + product;
    }

    public void setProduct(double product) {
        this.product = product;
    }

    public double getProduct() {
        return product;
    }

    public void display() {
        System.out.println("Nama pelanggan\t\t\t:" + super.getNama());
        System.out.println("Member\t\t\t\t:" + super.getAnggota());
        System.out.println("Biaya perawatan\t\t\t:" + super.getBiaya());
        System.out.println("Total perawatan\n----->(tidak mendapat diskon)\t:" + getDisc());
    }

    public void totalPerawatan() {
        System.out.println("Harga product\t\t\t:" + getProduct());
        System.out.println("Total product\n----->(tidak mendapat diskon)\t:" + getProduct());
        System.out.println("Total biaya\t\t\t:" + getTotal());
    }
}
