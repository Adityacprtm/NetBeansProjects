package Modul3Bab7;
public class SalariedProduct extends Employee {
    private double products;//produk yang dihasilkan per minggu
    private double price = 10000;//harga per produk
    public SalariedProduct(String name, String noKTP, double products) {
        super(name, noKTP);
        setProducts(products);
    }
    public double getProducts() {
        return products;
    }
    public void setProducts(double products) {
        this.products = products;
    }
    public double getPrice() {
        return price;
    }
    public double getWeeklySalary() {
        return getPrice() * getProducts();
    }
    @Override
    public double earnings() {
        return getWeeklySalary() * 4;
    }
    @Override
    public String toString() {
        return String.format("Salaried Product: " + super.toString() + "\nWeekly Salary: " + getWeeklySalary());
    }
}
