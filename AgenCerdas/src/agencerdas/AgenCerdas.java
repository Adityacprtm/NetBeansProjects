package AgenCerdas;

public class AgenCerdas {

    private String lingkungan[][][];

    AgenCerdas(int locationX, int locationY) {
        lingkungan = new String[locationX][locationY][3];
    }

    public void setKondisi(int i, int j, String Nama, String status) {
        lingkungan[i - 1][j - 1][0] = Nama;
        lingkungan[i - 1][j - 1][1] = status;
        lingkungan[i - 1][j - 1][2] = "false";
    }

    public void vacumm(int i, int j, String status) {
        if ("kotor".equals(status.toLowerCase())) {
            System.out.println("----bersih-bersih----");
            status = "bersih";
            lingkungan[i][j][1] = status;
            vacumm(i, j, status);

        } else if (i - 1 < lingkungan.length && i - 1 >= 0 && lingkungan[(i - 1)][j][2].equals("false")) {
            System.out.println("geser atas");
            lingkungan[(i - 1)][j][2] = "true";
            System.out.println("Lokasi " + lingkungan[i - 1][j][0]);
            vacumm(i - 1, j, lingkungan[i - 1][j][1]);
        } else if (i + 1 < lingkungan.length && i + 1 >= 0 && lingkungan[(i + 1)][j][2].equals("false")) {
            System.out.println("geser bawah");
            lingkungan[(i + 1)][j][2] = "true";
            System.out.println("Lokasi " + lingkungan[i + 1][j][0]);
            vacumm(i + 1, j, lingkungan[i + 1][j][1]);
        } else if (j - 1 < lingkungan[0].length && j - 1 >= 0 && lingkungan[i][(j - 1)][2].equals("false")) {
            System.out.println("geser kiri");
            lingkungan[i][(j - 1)][2] = "true";
            System.out.println("Lokasi " + lingkungan[i][j - 1][0]);
            vacumm(i, j - 1, lingkungan[i][j - 1][1]);
        } else if (j + 1 < lingkungan[0].length && j + 1 >= 0 && lingkungan[i][(j + 1)][2].equals("false")) {
            System.out.println("geser kanan");
            lingkungan[i][(j + 1)][2] = "true";
            System.out.println("Lokasi " + lingkungan[i][j + 1][0]);
            vacumm(i, j + 1, lingkungan[i][j + 1][1]);
        }
    }

    public void bersihkan() {
        System.out.println("Lokasi " + lingkungan[0][0][0]);
        lingkungan[0][0][2] = "true";
        vacumm(0, 0, lingkungan[0][0][1]);
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
        System.out.println("SEMUA SUDAH BERSIH");
    }

    public static void main(String[] args) {
        AgenCerdas a = new AgenCerdas(2, 3);
        a.setKondisi(1, 1, "Lokasi 1", "kotor");
        a.setKondisi(1, 2, "Lokasi 2", "kotor");
        a.setKondisi(1, 3, "Lokasi 3", "bersih");
        a.setKondisi(2, 1, "Lokasi 4", "kotor");
        a.setKondisi(2, 2, "Lokasi 5", "kotor");
        a.setKondisi(2, 3, "Lokasi 6", "kotor");
        a.bersihkan();
    }
}

/*
Method setKondisi berisi inisialisasi nama lokasi, kondisi pada lokasi tersebut bersih atau kotor
dan sebuah state yang menentukan apakah lokasi tersebut sudah dilewati atau belum

Method vacuum menentukan kemana arah yang akan dituju selanjutnya setelah dibersihkan dengan menggunakan
kondisi if-else.

Method bersihkan berfungsi untuk memulai method vacuum yang dimulai dari lokasi pertama

Method cek akan mencek apakah masih ada lokasi yang kotor

Method main berisi contoh kasus yang terdiri dari dua dimensi 2x3
*/
