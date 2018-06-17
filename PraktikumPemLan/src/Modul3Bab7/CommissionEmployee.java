package Modul3Bab7;
public class CommissionEmployee extends Employee {
    private double grossSales;//penjualan per minggu
    private double commissionRate;//komisi
    public CommissionEmployee(String name, String noKTP, double sales, double rate) {
        super(name, noKTP);
        setGrossSales(sales);
        setCommissionRate(rate);
    }
    public void setGrossSales(double sales) {
        grossSales = sales;
    }
    public double getGrossSales() {
        return grossSales;
    }
    public void setCommissionRate(double rate) {
        commissionRate = rate;
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    @Override
    public double earnings() {
        return (getCommissionRate() * getGrossSales()) * 4 + getBonusBulanLahir();//ditambah bonus
    }
    @Override
    public String toString() {
        return String.format("Commision employee: " + super.toString() + "\ngross sales: " + getGrossSales() + "\ncommission rate: " + getCommissionRate());
    }
}
//
//    private double grossSales;//penjualan per minggu
//    private double commissionRate;//komisi
//
//    public CommissionEmployee(String name, String noKTP, double sales, double rate) {
//        super(name, noKTP);
//        setGrossSales(sales);
//        setCommissionRate(rate);
//    }
//
//    public void setGrossSales(double sales) {
//        grossSales = sales;
//    }
//
//    public double getGrossSales() {
//        return grossSales;
//    }
//
//    public void setCommissionRate(double rate) {
//        commissionRate = rate;
//    }
//
//    public double getCommissionRate() {
//        return commissionRate;
//    }
//
//    public double earnings() {
//        return getCommissionRate() * getGrossSales();
//    }
//
//    public String toString() {
//        return String.format("Commision employee: " + super.toString() + "\ngross sales: " + getGrossSales() + "\ncommission rate " + getCommissionRate());
//    }
//}
