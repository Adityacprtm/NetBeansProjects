package UTPSem2;

public class PasienMain {

    public static void main(String[] args) {
        String[][] data = new String[][]{
            {"riyan", "kanker", "12"},
            {"robi", "tipus", "4"},
            {"aji", "kangker", "9"},
            {"binar", "db", "7"},
            {"arif", "demam", "2"},
            {"boy", "flu", "1"}};

        Pasien[] pasien = new Pasien[6];
        for (int i = 0; i < pasien.length; i++) {
            pasien[i] = new Pasien(data[i][0], data[i][1], Integer.parseInt(data[i][2]));
//            pasien[i].urutByInap(pasien[i]);
            pasien[i].displayAllPasien(pasien);
        }
    }
}
