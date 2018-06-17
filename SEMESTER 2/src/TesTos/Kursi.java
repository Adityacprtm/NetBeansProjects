package TesTos;

public class Kursi {

    public String warna;
    public String bahan;
    public String nama;
    public int harga;

    public void setWarna(String w) {
        warna = w;
    }

    public void setBahan(String b) {
        bahan = b;
    }

    public void setNama(String n) {
        nama = n;
    }

    public void setHarga(int h) {
        harga = (h * 100);
    }

    public void tampilPesan() {
        System.out.println("Nama : " + nama);
        System.out.println("warna : " + warna);
        System.out.println("Bahan : " + bahan);
        System.out.println("harga disc : " + harga);
    }
}
