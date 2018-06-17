package Modul2Bab4;
public class BukuAlamat {
    private String nama, alamat, notelp, email;
    public BukuAlamat() {
    }
    public BukuAlamat(String nama, String alamat, String notelp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
        this.email = email;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setNoTelp(String notelp) {
        this.notelp = notelp;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNama() {
        return this.nama;
    }
    public String getAlamat() {
        return this.alamat;
    }
    public String getNoTelp() {
        return this.notelp;
    }
    public String getEmail() {
        return this.email;
    }
}