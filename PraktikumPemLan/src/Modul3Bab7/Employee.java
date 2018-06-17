package Modul3Bab7;

import java.util.*;

public abstract class Employee {

    private String name;
    private String noKTP;
    private Date tanggalLahir;
    private Date bulanIni = new Date();

    public Employee(String name, String noKTP) {
        this.name = name;
        this.noKTP = noKTP;
    }

    public void setTanggalLahir(int tgl, int bulan, int tahun) {
        this.tanggalLahir = new Date(tahun, bulan, tgl);
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setBulanGajian(int bulan) {
        bulanIni.setMonth(bulan - 1);
    }

    public double getBonusBulanLahir() {
        if (bulanIni.getMonth() + 1 == tanggalLahir.getMonth()) {
            return 100000;
        } else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String toString() {
        return String.format(" " + getName() + "\nNo. KTP: " + getNoKTP());
    }

    public abstract double earnings();
}
//
//
//    private String name;
//    private String noKTP;
//
//    public Employee(String name, String noKTP) {
//        this.name = name;
//        this.noKTP = noKTP;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getNoKTP() {
//        return noKTP;
//    }
//
//    public String toString() {
//        return String.format(" " + getName() + "\nNo. KTP : " + getNoKTP());
//    }
//
//    public abstract double earnings();//pendapatan
//}
