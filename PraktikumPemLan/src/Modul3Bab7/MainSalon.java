package Modul3Bab7;

public class MainSalon {

    public static void main(String[] args) {
        Salon member[] = new Salon[7];
        member[0] = new Premium("Natasha", "Crembath", 20000, "Shampo", 5000);
        member[1] = new Gold("Nauljam", "Potong Rambut", 10000, "Sabun Muka", 2500);
        member[2] = new Silver("Joko", "Rebonding", 50000, "Sabun", 15000);
        member[3] = new NonMember("Kuncoro", "Make Up", 100000, "Gunting", 75000);
        member[4] = new Premium("Susilo", "Sulam Alis", 200000, "Kuas", 150000);
        member[5] = new Gold("Antonella", "Sauna", 500000, "-", 0);
        member[6] = new NonMember("Sonic", "-", 0, "Cat Rambut", 50000);
        System.out.printf("%-11s%-12s%-15s%-15s%-15s%-13s%-15s%-15s%s\n", "NAMA", "MEMBER", "LAYANAN", "BIAYA LAYANAN", "BIAYA DISKON", "PRODUK", "HARGA PRODUK", "HARGA DISKON", "TOTAL PEMBAYARAN");
        for (Salon semuaMember : member) {
            System.out.printf("%-11s%-12s%-15sRp %-12.0fRp %-12.0f%-13sRp %-12.0fRp %-12.0fRp %.0f\n", semuaMember.getNama(), semuaMember.getAnggota(), semuaMember.getLayanan(), semuaMember.getBiayaLayanan(), semuaMember.getDiskonLayanan(), semuaMember.getProduk(), semuaMember.getHargaProduk(), semuaMember.getDiskonProduk(), semuaMember.getTotalHarga());
        }
        System.out.println("===============================================================================================================================");
        System.out.println("                                                      155150207111081");
        System.out.println("                                         >> copyright© by Aditya Chamim Pratama <<");
        System.out.println("===============================================================================================================================");
    }
}
