package Modul3Bab7;
public class UjiCoba {
    public static void main(String[] args) {
        Employee[] salariedProduct = new SalariedProduct[4];
        salariedProduct[0] = new SalariedProduct("Ter Stegen", "1", 8);
        salariedProduct[1] = new SalariedProduct("Vermalen", "23", 2);
        salariedProduct[2] = new SalariedProduct("Rakitic", "4", 10);
        salariedProduct[3] = new SalariedProduct("Sandro", "30", 6);
        for (Employee salariedProduct1 : salariedProduct) {
            System.out.println(salariedProduct1);
            System.out.printf("pendapatan: $%,.2f\n\n", salariedProduct1.earnings());
        }
    }
}
