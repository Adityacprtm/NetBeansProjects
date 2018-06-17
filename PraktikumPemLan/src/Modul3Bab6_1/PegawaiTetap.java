package Modul3Bab6_1;
import java.util.*;
public class PegawaiTetap extends Employee {
    private double bonus, tunjangan;
    public PegawaiTetap(String nama, String idKerja, String jabatan, boolean istri, int anak, int tahun, int bulan, int hari) {
        super(nama, idKerja, jabatan, istri, anak, tahun, bulan, hari);
    }
    public int lamaKerja() {
        int lamaKerja;
        lamaKerja = (Calendar.getInstance().getTime().getYear() + 1900) - super.getTahunKerja();
        return lamaKerja;
    }
    @Override
    public double getGaji() {
        double gaji = super.getGaji() + getTunjangan() + getBonus();
        super.setGaji(gaji);
        return super.getGaji();
    }
    public double getBonus() {
        if (lamaKerja() <= 5) {
            bonus = 0;
        } else if (lamaKerja() >= 6 && lamaKerja() <= 10) {
            bonus = 0.05 * lamaKerja() * super.getGaji();
        } else if (lamaKerja() > 10) {
            bonus = (0.1 * lamaKerja() * super.getGaji()) * 2;
        }
        return bonus;
    }
    public double getTunjangan() {
        tunjangan = tunjanganAnak() + tunjanganIstri();
        return tunjangan;
    }
    private double tunjanganIstri() {
        double tunjanganIstri;
        if (super.getIstri().equals("Ya")) {
            tunjanganIstri = 0.1 * (super.getGaji() + getBonus());
        } else {
            tunjanganIstri = 0;
        }
        return tunjanganIstri;
    }
    private double tunjanganAnak() {
        double tunjanganAnak = 0;
        if (super.getAnak() > 3) {
            tunjanganAnak = 3 * 0.15 * (super.getGaji() + getBonus());
        } else if (super.getAnak() <= 3) {
            tunjanganAnak = super.getAnak() * 0.15 * (super.getGaji() + getBonus());
        }
        return tunjanganAnak;
    }
}
