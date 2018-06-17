package TesTos;

public class MainKursi {
    public static void main(String[] args) {
        Kursi besar = new Kursi();
        Kursi kecil = new Kursi();
        Kursi sedang = new Kursi();
        
        besar.warna = "merah";
        besar.bahan = "kayu";
        besar.nama = "brendy";
        besar.harga = 1000;
        besar.tampilPesan();
        System.out.println("==============================");
        
        kecil.warna = "pink";
        kecil.nama = "ryan";
        kecil.harga = 10000;
        kecil.bahan = "kapas";
        kecil.tampilPesan();
        System.out.println("==============================");
        
        sedang.warna = "qqqq";
        sedang.nama = "wwwww";
        sedang.harga = 100000;
        sedang.bahan = "hgfhfh";
        sedang.tampilPesan();
        System.out.println("==============================");
    }
}
