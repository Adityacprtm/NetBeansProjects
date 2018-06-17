package Tugas1;

public class Peternakan {

    public String jenis;
    public int jumlah;
    public int harga;
    public int untung;

    public int melahirkan(int a) {
        return this.jumlah = jumlah + a;
    }

    public void penjualan(int x) {
        this.untung = harga * x;
        this.jumlah = jumlah - x;
    }
    
    public void tampilkanData() {
        System.out.println("Jenis   : " + jenis);
        System.out.println("Jumlah  : " + jumlah);
        System.out.println("Harga   : " + harga);
    }

    public void tampilkanUntung() {
        System.out.println("Jenis       : " + jenis);
        System.out.println("Jumlah sisa : " + jumlah);
        System.out.println("Keuntungan  : " + untung);
    }
}
