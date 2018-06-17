package uapsem2;

import java.io.*;

public class InputData {

    private String nama;
    private String alamat;
    private String noTelp;
    private String email;

    public InputData(String nama, String alamat, String noTelp, String email) throws IOException {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter("123456.txt"));
        bw.write(this.nama);
        bw.newLine();
        bw.write(this.alamat);
        bw.newLine();
        bw.write(this.noTelp);
        bw.newLine();
        bw.write(this.email);
        bw.newLine();
        bw.close();
    }
}
