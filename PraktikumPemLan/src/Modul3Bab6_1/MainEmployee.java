package Modul3Bab6_1;
public class MainEmployee {
    public static void main(String[] args) {
        Manager bos[] = new Manager[1];
        bos[0] = new Manager("Aditya", "4d1ty4", "Manager", true, 10, 1997, 6, 21);
        PegawaiTetap pegawaiT[] = new PegawaiTetap[10];
        pegawaiT[0] = new PegawaiTetap("Bravo", "8r4v0", "PNS", false, 0, 2011, 1, 23);
        pegawaiT[1] = new PegawaiTetap("Pique", "p1qu3", "PNS", true, 1, 2010, 4, 12);
        pegawaiT[2] = new PegawaiTetap("Alba", "4lb4", "PNS", false, 3, 2004, 9, 26);
        pegawaiT[3] = new PegawaiTetap("Puyol", "puy0l", "PNS", true, 2, 2006, 2, 8);
        pegawaiT[4] = new PegawaiTetap("Busquets", "8u5qu3t5", "PNS", false, 5, 2013, 5, 17);
        pegawaiT[5] = new PegawaiTetap("Iniesta", "1n135t4", "PNS", true, 8, 2000, 11, 30);
        pegawaiT[6] = new PegawaiTetap("Rakitic", "124k1t1c", "PNS", true, 1, 2012, 5, 22);
        pegawaiT[7] = new PegawaiTetap("Roberto", "12083rt0", "PNS", false, 0, 2003, 4, 12);
        pegawaiT[8] = new PegawaiTetap("Turan", "Tu124n", "PNS", true, 9, 2007, 17, 28);
        pegawaiT[9] = new PegawaiTetap("Vidal", "v1d4l", "PNS", true, 4, 2003, 12, 30);
        PegawaiTidakTetap pegawaiTT[] = new PegawaiTidakTetap[5];
        pegawaiTT[0] = new PegawaiTidakTetap("Douglas", "d0u6l45", "non-PNS", false, 0, 2015, 4, 21);
        pegawaiTT[1] = new PegawaiTidakTetap("Mathiew", "m4th13w", "non-PNS", true, 11, 2014, 7, 10);
        pegawaiTT[2] = new PegawaiTidakTetap("Samper", "54mp3r", "non-PNS", false, 4, 2012, 8, 1);
        pegawaiTT[3] = new PegawaiTidakTetap("Sandro", "54ndr0", "non-PNS", false, 0, 2011, 12, 4);
        pegawaiTT[4] = new PegawaiTidakTetap("Rafinha", "124f1nh4", "non-PNS", true, 2, 2010, 1, 19);
        pegawaiTT[0].setLembur(19);
        pegawaiTT[1].setLembur(3);
        pegawaiTT[2].setLembur(10);
        pegawaiTT[3].setLembur(11);
        pegawaiTT[4].setLembur(14);
        System.out.printf("%-11s%-11s%-10s%-13s%-13s%-8s%-6s%-8s%-10s%-11s%s\n", "NAMA", "ID", "JABATAN",
                "TAHUN MASUK", "LAMA KERJA", "ISTRI", "ANAK", "LEMBUR", "BONUS", "TUNJANGAN", "GAJI");
        for (int i = 0; i < bos.length; i++) {
            System.out.printf("%-11s%-11s%-10s%-13d%-13d%-8s%-6d%-8s%-10.0f%-11.0fRp %.0f\n", bos[i].getNama(),
                    bos[i].getIdKerja(), bos[i].getJabatan(), bos[i].getTahunKerja(), bos[i].lamaKerja(),
                    bos[i].getIstri(), bos[i].getAnak(), "-", bos[i].getBonus(), bos[i].getTunjangan(), bos[i].getGaji());
        }
        for (int i = 0; i < pegawaiT.length; i++) {
            System.out.printf("%-11s%-11s%-10s%-13d%-13d%-8s%-6d%-8s%-10.0f%-11.0fRp %.0f\n", pegawaiT[i].getNama(),
                    pegawaiT[i].getIdKerja(), pegawaiT[i].getJabatan(), pegawaiT[i].getTahunKerja(), pegawaiT[i].lamaKerja(),
                    pegawaiT[i].getIstri(), pegawaiT[i].getAnak(), "-", pegawaiT[i].getBonus(), pegawaiT[i].getTunjangan(),
                    pegawaiT[i].getGaji());
        }
        for (int i = 0; i < pegawaiTT.length; i++) {
            System.out.printf("%-11s%-11s%-10s%-13d%-13s%-8s%-6d%-8d%-10s%-11sRp %.0f\n", pegawaiTT[i].getNama(),
                    pegawaiTT[i].getIdKerja(), pegawaiTT[i].getJabatan(), pegawaiTT[i].getTahunKerja(), "Tidak Tetap",
                    pegawaiTT[i].getIstri(), pegawaiTT[i].getAnak(), pegawaiTT[i].getLembur(), "-", "-", pegawaiTT[i].getGaji());
        }
    }
}
