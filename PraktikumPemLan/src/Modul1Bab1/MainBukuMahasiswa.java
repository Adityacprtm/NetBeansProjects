package Modul1Bab1;
public class MainBukuMahasiswa {
    public static void main(String[] args) {
        /*lembar buku = 50
        perhari = 100 kata = 1/2 halaman
        1 halaman = 200 kata
        */
        BukuMahasiswa buku1 = new BukuMahasiswa();
        buku1.lembarBuku = 50;
        buku1.kataPerHari = 200;
        buku1.halamanBukuPerHari = 1;
        buku1.hitungHari();
    }
}
