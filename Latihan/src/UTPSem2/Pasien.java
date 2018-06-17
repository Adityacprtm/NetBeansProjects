package UTPSem2;

import java.util.Arrays;

public class Pasien {

    private String nama;
    private String penyakit;
    private int inap;

    public Pasien(String nama, String penyakit, int inap) {
        this.nama = nama;
        this.penyakit = penyakit;
        this.inap = inap;
    }
    
    public Pasien(){
        
    }

    public String getNama() {
        return this.nama;
    }

    public String getPenyakit() {
        return this.penyakit;
    }

    public int getLamaInap() {
        return this.inap;
    }

    public void tampilDataPasien() {
//        System.out.printf("%-10s%-13s%s\n", getNama(), getPenyakit(), getLamaInap());
    }

    public void displayAllPasien(Pasien[] pasien) {
        System.out.printf("%-10s%-13s%s\n", getNama(), getPenyakit(), getLamaInap());
        
    }

    public void urutByInap(Pasien[] pasien) {
        Pasien[] urutByInap = new Pasien[pasien.length];
        for (int i = 0; i < pasien.length; i++) {
            urutByInap[i] = new Pasien();
        }
        int lebihBesar = pasien[0].getLamaInap();
        int tmp = lebihBesar;
        urutByInap[0] = pasien[0];
        for (int i = 1; i < pasien.length; i++) {
            if (tmp < pasien[i].getLamaInap()) {
                lebihBesar = pasien[i].getLamaInap();
                tmp = lebihBesar;
                
            }
            
            
        }
    }
}
