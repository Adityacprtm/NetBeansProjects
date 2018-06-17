package ADT_LIST_BARU;
public class Mahasiswa {
    String nim;
    String nama;
    double ipk;
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public double getIpk() {
        return ipk;
    }
}