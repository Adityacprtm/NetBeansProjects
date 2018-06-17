package Modul1Bab1;

public class Mobil {

    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    private double jarak;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {
        kecepatan = i;
        rubahKecepatan(kecepatan);
    }

    public void setWaktu(double w) {
        waktu = w;
        rubahSekon(waktu);
    }

    private void rubahSekon(double s) {
        this.waktu = 3600 * this.waktu;
    }

    private void rubahKecepatan(int k) {
        this.kecepatan = (kecepatan * 1000) / 3600;
    }

    public void hitungJarak() {
        jarak = this.kecepatan * this.waktu;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + "m/s");
        System.out.println("dalam waktu " + this.waktu + " detik");
        System.out.println("jarak yang dapat ditempuh adalah " + jarak / 1000 + "km");
    }
}
