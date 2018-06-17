package TesTos;

public class Mahasiswa {

    private String nama;
    private String nim;
    private String fakultas;
    private String angkatan;
    private String ipk;

    public void setNama(String s) {
        nama = s;
    }

    public void setNim(String s) {
        nim = s;
    }

    public void setFakultas(String s) {
        fakultas = s;
    }

    public void setAngkatan(String s) {
        if ((s.substring(0, 2)).equals("15")) {
            angkatan = "2015";
        } else if ((s.substring(0, 2)).equals("14")) {
            angkatan = "2014";
        } else if ((s.substring(0, 2)).equals("13")) {
            angkatan = "2013";
        }
    }

    public void setIpk(String i) {
        if (i.equals("4")) {
            ipk = "A";
        } else if (i.equals("3")) {
            ipk = "B";
        } else if (i.equals("2")) {
            ipk = "C";
        } else if (i.equals("1")) {
            ipk = "D";
        } else if (i.equals("0")) {
            ipk = "E";
        }
    }

    public void displayMessage() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Fakultas\t: " + fakultas);
        System.out.println("Angkatan\t: " + angkatan);
        System.out.println("IPK\t\t: " + ipk);
    }
}
