package AgenCerdas;

public class AgenCerdas1 {

    private String lingkungan[][][];

    AgenCerdas1(int locationX, int locationY) {
        lingkungan = new String[locationX][locationY][6];
    }

    public void setKondisi(int i, int j, String Nama, String status, String kotoran) {
        lingkungan[i - 1][j - 1][0] = Nama;
        lingkungan[i - 1][j - 1][1] = status;
        lingkungan[i - 1][j - 1][2] = "false";
        lingkungan[i - 1][j - 1][3] = kotoran;
        lingkungan[i - 1][j - 1][4] = "";
        lingkungan[i - 1][j - 1][5] = "";

    }

    public void vacumm(int i, int j, String status, String kotoran) {
        if ("kotor".equals(status.toLowerCase())) {
            System.out.println("----bersih-bersih----");
            status = "bersih";
            lingkungan[i][j][1] = status;
            String[] kotoranSplit = kotoran.split(",");
            for (int k = 0; k < kotoranSplit.length; k++) {
                if (kotoranSplit[k].equals("debu") || kotoranSplit[k].equals("rambut")) {
                    lingkungan[i][j][4] = lingkungan[i][j][4] + " " + kotoranSplit[k];
                } else {
                    lingkungan[i][j][5] = lingkungan[i][j][5] + " " + kotoranSplit[k];
                }
            }
            vacumm(i, j, status, kotoran);

        } else if (i - 1 < lingkungan.length && i - 1 >= 0 && lingkungan[(i - 1)][j][2].equals("false")) {
            System.out.println("geser atas");
            lingkungan[(i - 1)][j][2] = "true";
            System.out.println("Lokasi " + lingkungan[i - 1][j][0]);
            vacumm(i - 1, j, lingkungan[i - 1][j][1], lingkungan[i - 1][j][3]);
        } else if (i + 1 < lingkungan.length && i + 1 >= 0 && lingkungan[(i + 1)][j][2].equals("false")) {
            System.out.println("geser bawah");
            lingkungan[(i + 1)][j][2] = "true";
            System.out.println("Lokasi " + lingkungan[i + 1][j][0]);
            vacumm(i + 1, j, lingkungan[i + 1][j][1], lingkungan[i + 1][j][3]);
        } else if (j - 1 < lingkungan[0].length && j - 1 >= 0 && lingkungan[i][(j - 1)][2].equals("false")) {
            System.out.println("geser kiri");
            lingkungan[i][(j - 1)][2] = "true";
            System.out.println("Lokasi " + lingkungan[i][j - 1][0]);
            vacumm(i, j - 1, lingkungan[i][j - 1][1], lingkungan[i][j - 1][3]);
        } else if (j + 1 < lingkungan[0].length && j + 1 >= 0 && lingkungan[i][(j + 1)][2].equals("false")) {
            System.out.println("geser kanan");
            lingkungan[i][(j + 1)][2] = "true";
            System.out.println("Lokasi " + lingkungan[i][j + 1][0]);
            vacumm(i, j + 1, lingkungan[i][j + 1][1], lingkungan[i][j + 1][3]);
        }
    }

    public void bersihkan() {
        System.out.println("Lokasi " + lingkungan[0][0][0]);
        lingkungan[0][0][2] = "true";
        vacumm(0, 0, lingkungan[0][0][1], lingkungan[0][0][3]);
        cek();

    }

    public void cek() {
        for (int i = 0; i < lingkungan.length; i++) {
            for (int j = 0; j < lingkungan[0].length; j++) {
                if (!"bersih".equals(lingkungan[i][j][1])) {
                    bersihkan();
                    break;
                }
            }
        }
        System.out.println("BEBERAPA SAMPAH YANG TELAH DIBERSIHKAN:");
        int count = 1;
        for (int i = 0; i < lingkungan.length; i++) {
            for (int j = 0; j < lingkungan[0].length; j++) {
                if (!lingkungan[i][j][4].equals("")) {
                    System.out.println("Lokasi " + count + " : " + lingkungan[i][j][4]);
                }
                count++;
            }
        }
        System.out.println("BEBERAPA SAMPAH YANG TIDAK DAPAT DIBERSIHKAN:");
        count = 1;
        for (int i = 0; i < lingkungan.length; i++) {
            for (int j = 0; j < lingkungan[0].length; j++) {
                if (!lingkungan[i][j][5].equals("")) {
                    System.out.println("Lokasi " + count + " : " + lingkungan[i][j][5]);
                }
                count++;
            }
        }
    }

    public static void main(String[] args) {
        AgenCerdas1 a = new AgenCerdas1(2, 3);
        a.setKondisi(1, 1, "Lokasi 1", "kotor", "debu,rambut,kertas");
        a.setKondisi(1, 2, "Lokasi 2", "kotor", "kulit jeruk");
        a.setKondisi(1, 3, "Lokasi 3", "bersih", "");
        a.setKondisi(2, 1, "Lokasi 4", "kotor", "rambut,plastik");
        a.setKondisi(2, 2, "Lokasi 5", "bersih", "");
        a.setKondisi(2, 3, "Lokasi 6", "kotor", "kertas,debu");
        a.bersihkan();
    }
}

/*
Method setKondisi berisi inisialisasi nama lokasi, kondisi pada lokasi tersebut bersih atau kotor,
sebuah state yang menentukan apakah lokasi tersebut sudah dilewati atau belum dan beberapa jenis kotoran yang
ada pada lokasi tersebut

Method vacuum menentukan kemana arah yang akan dituju selanjutnya setelah dibersihkan dengan menggunakan
kondisi if-else. Sebelum ditentukan arah yang akan dituju, method vacuum terlebih dahulu memisahkan mana yang dapat disedot
dan mana yang tidak dapat disedot yang kemudian dimasukkan kedalam sebuah variabel string didalam array

Method bersihkan berfungsi untuk memulai method vacuum yang dimulai dari lokasi pertama

Method cek akan mencek apakah masih ada lokasi yang kotor setelah itu akan menampilkan kotoran apa saja yang dapat dibersihkan dan
juga kotoran yang tidak dapat dibersihkan

Method main berisi contoh kasus yang terdiri dari dua dimensi 2x3 dengan beberapa jenis kotoran pada lokasi tertentu
 */
