package praktikumpemlan;

import java.util.Date;

public class pegawai {

    private String nama;
    private String NIP;
    private double gaji = 5000;
    private double gajiBersih;
    private boolean pasangan = false;
    private int masuk;

    public pegawai(String nama, String NIP) {
        this.nama = nama;
        this.NIP = NIP;
    }

    public pegawai(String nama, String NIP, double gaji, boolean p, int masuk) {
        this.nama = nama;
        this.NIP = NIP;
        this.gaji = gaji;
        this.pasangan = p;
        this.masuk = masuk;
        this.gajiBersih = gaji;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setPasangan(boolean pasangan) {
        this.pasangan = pasangan;
    }

    public void setGajiBersih(double gajiBersih) {
        this.gajiBersih = gajiBersih;
    }

    public String getNama() {
        return nama;
    }

    public String getNIP() {
        return NIP;
    }

    public double getGaji() {
        return gaji;
    }

    public double getGajiBersih() {
        return gajiBersih;
    }

    public boolean isPasangan() {
        return pasangan;
    }

    public double bonuspasangan() {
        if (pasangan == true) {
            return gaji * 0.1;
        } else {
            return 0;
        }
    }

    public void tambahgaji() {
        if (pasangan == true) {
            gajiBersih = gajiBersih * 1.1;
        }
        Date d = new Date();
        if (((d.getYear() + 1900) - masuk) > 5) {
            gajiBersih = gajiBersih * 1.05;
        }
    }

    public void tambahgaji(double bonus) {
        if (pasangan == true) {
            gajiBersih = gajiBersih * 1.1;
        }
        Date d = new Date();
        if (((d.getYear() + 1900) - masuk) > 5) {
            gajiBersih = gajiBersih * 1.05;
        }
        gajiBersih = gajiBersih + bonus;
    }

    public double masuk() {
        Date d = new Date();
        if ((d.getYear() + 1900) - masuk > 5) {
            return gaji = 0.05;
        } else {
            return 0;
        }
    }

    public double total() {
        return gaji + bonuspasangan() + masuk();
    }

    public void info() {
        System.out.println("NIP Pegawai \t: " + NIP);
        System.out.println("Nama Pegawai \t: " + nama);
        System.out.printf("Gaji Pegawai \t: %.2f  ", gaji);
        System.out.println("");
        if (pasangan == true) {
            System.out.println("Status \t\t: Punya Pasangan");
        } else {
            System.out.println("Status \t\t: Tidak Punya Pasangan");
        }
        System.out.println("Gaji pokok \t: " + gaji);
        System.out.println("Gaji bersih \t: " + gajiBersih);
        Date d = new Date();
        if (d.getYear() + 1900 - masuk > 5) {
            System.out.println("Pegawai Sudah Senior");
        } else {
            System.out.println("Pegawai Masih Junior");
        }
    }
}
