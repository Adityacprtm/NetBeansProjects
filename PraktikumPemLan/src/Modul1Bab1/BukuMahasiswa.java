package Modul1Bab1;
public class BukuMahasiswa {
    public double lembarBuku, kataPerHari, halamanBukuPerHari, hari;
    public void setLembarBuku(double a) {
        lembarBuku = a;
    }
    public void setKataPerHari(double b) {
        kataPerHari = b;
    }
    public void setHalamanBukuPerHari(double c) {
        halamanBukuPerHari = c;
    }
    public void hitungHari() {
        hari = kataPerHari * (halamanBukuPerHari * 4) * lembarBuku / kataPerHari;
        System.out.println(hari);
    }
}
