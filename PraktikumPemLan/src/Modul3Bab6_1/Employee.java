package Modul3Bab6_1;
import java.util.*;
public class Employee {
    private String nama, idKerja, jabatan;
    private double gaji = 1000000;
    private boolean istri;
    private int tahunKerja, anak;
    public Employee(String nama, String idKerja, String jabatan, boolean istri, int anak, int tahun, int bulan, int hari) {
        this.nama = nama;
        this.idKerja = idKerja;
        this.jabatan = jabatan;
        this.istri = istri;
        this.anak = anak;
        GregorianCalendar calender = new GregorianCalendar(tahun, bulan - 1, hari);
        this.tahunKerja = calender.getTime().getYear() + 1900;
    }
    public String getNama() {
        return nama;
    }
    public String getIdKerja() {
        return idKerja;
    }
    public String getJabatan() {
        return jabatan;
    }
    public int getTahunKerja() {
        return tahunKerja;
    }
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public int getAnak() {
        return anak;
    }
    public String getIstri() {
        if (istri == true) {
            return "Ya";
        } else {
            return "Tidak";
        }
    }
}
