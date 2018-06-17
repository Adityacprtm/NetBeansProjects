package projectakhir;

public class Faktur {

    private String namaPenyewa;
    private Double harga;
    private String jenisMobil;
    private String noPol;
    private String tglPinjam;
    private int hari;
    private String tglKembali;
    private String namaKaryawan;

    public Faktur() {

    }

    public Faktur(String namaPenyewa, Double harga, String jenisMobil, String noPol, String tglPinjam, int hari, String tglKembali, String namaKaryawan) {
        this.namaPenyewa = namaPenyewa;
        this.harga = harga;
        this.jenisMobil = jenisMobil;
        this.noPol = noPol;
        this.tglPinjam = tglPinjam;
        this.hari = hari;
        this.tglKembali = tglKembali;
        this.namaKaryawan = namaKaryawan;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public void setNamaPenyewa(String namaPenyewa) {
        this.namaPenyewa = namaPenyewa;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public String getJenisMobil() {
        return jenisMobil;
    }

    public void setJenisMobil(String jenisMobil) {
        this.jenisMobil = jenisMobil;
    }

    public String getNoPol() {
        return noPol;
    }

    public void setNoPol(String noPol) {
        this.noPol = noPol;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

}
