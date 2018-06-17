package projectakhir;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBase {

    public Karyawan[] getKaryawan() {
        return karyawan;
    }

    public Pelanggan[] getPelanggan() {
        return pelanggan;
    }

    public Mobil[] getAvanza() {
        return avanza;
    }

    public Mobil[] getInnova() {
        return innova;
    }

    public Mobil[] getElf() {
        return elf;
    }

    public Mobil[] getEzpass() {
        return ezpass;
    }

    public Mobil[] getGrandmax() {
        return grandmax;
    }

    public Mobil[] getKijang() {
        return kijang;
    }

    private static int count = 1;
    private Karyawan karyawan[] = new Karyawan[2];
    private Mobil avanza[] = new Mobil[3];
    private Mobil elf[] = new Mobil[3];
    private Mobil ezpass[] = new Mobil[3];
    private Mobil grandmax[] = new Mobil[3];
    private Mobil innova[] = new Mobil[3];
    private Mobil kijang[] = new Mobil[3];
    public Pelanggan pelanggan[] = new Pelanggan[this.lineOfTxt("pelanggan.txt") / 6];
    public Faktur tulisFaktur = new Faktur();

    public DataBase() {
        BufferedReader read;
        BufferedReader read1;
        BufferedReader read2;
        BufferedReader read3;
        BufferedReader read4;
        BufferedReader read5;
        BufferedReader read6;
        BufferedReader read7;

        try {
            read = new BufferedReader(new FileReader("karyawan.txt"));
            read1 = new BufferedReader(new FileReader("avanza.txt"));
            read2 = new BufferedReader(new FileReader("elf.txt"));
            read3 = new BufferedReader(new FileReader("ez pass.txt"));
            read4 = new BufferedReader(new FileReader("grand max.txt"));
            read5 = new BufferedReader(new FileReader("innova.txt"));
            read6 = new BufferedReader(new FileReader("kijang.txt"));
            read7 = new BufferedReader(new FileReader("pelanggan.txt"));
            for (int i = 0; i < karyawan.length; i++) {
                karyawan[i] = new Karyawan();
                karyawan[i].setNama(read.readLine());
                karyawan[i].setNoInduk(read.readLine());
                read.readLine();
            }
            for (int i = 0; i < avanza.length; i++) {
                avanza[i] = new Mobil();
                avanza[i].setJenis(read1.readLine());
                avanza[i].setWarna(read1.readLine());
                avanza[i].setNoPol(read1.readLine());
                avanza[i].setHarga(Double.parseDouble(read1.readLine()));
                read1.readLine();
            }
            for (int i = 0; i < elf.length; i++) {
                elf[i] = new Mobil();
                elf[i].setJenis(read2.readLine());
                elf[i].setWarna(read2.readLine());
                elf[i].setNoPol(read2.readLine());
                elf[i].setHarga(Double.parseDouble(read2.readLine()));
                read2.readLine();
            }
            for (int i = 0; i < ezpass.length; i++) {
                ezpass[i] = new Mobil();
                ezpass[i].setJenis(read3.readLine());
                ezpass[i].setWarna(read3.readLine());
                ezpass[i].setNoPol(read3.readLine());
                ezpass[i].setHarga(Double.parseDouble(read3.readLine()));
                read3.readLine();
            }
            for (int i = 0; i < grandmax.length; i++) {
                grandmax[i] = new Mobil();
                grandmax[i].setJenis(read4.readLine());
                grandmax[i].setWarna(read4.readLine());
                grandmax[i].setNoPol(read4.readLine());
                grandmax[i].setHarga(Double.parseDouble(read4.readLine()));
                read4.readLine();
            }
            for (int i = 0; i < innova.length; i++) {
                innova[i] = new Mobil();
                innova[i].setJenis(read5.readLine());
                innova[i].setWarna(read5.readLine());
                innova[i].setNoPol(read5.readLine());
                innova[i].setHarga(Double.parseDouble(read5.readLine()));
                read5.readLine();
            }
            for (int i = 0; i < kijang.length; i++) {
                kijang[i] = new Mobil();
                kijang[i].setJenis(read6.readLine());
                kijang[i].setWarna(read6.readLine());
                kijang[i].setNoPol(read6.readLine());
                kijang[i].setHarga(Double.parseDouble(read6.readLine()));
                read6.readLine();
            }
            for (int i = 0; i < pelanggan.length; i++) {
                pelanggan[i] = new Pelanggan();
                pelanggan[i].setNama(read7.readLine());
                pelanggan[i].setAlamat(read7.readLine());
                pelanggan[i].setNoTelp(read7.readLine());
                pelanggan[i].setNoSert(read7.readLine());
                pelanggan[i].setKode(read7.readLine());
                read7.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void DataBase() {
        BufferedReader read;
        BufferedReader read1;
        BufferedReader read2;
        BufferedReader read3;
        BufferedReader read4;
        BufferedReader read5;
        BufferedReader read6;
        BufferedReader read7;

        try {
            read = new BufferedReader(new FileReader("karyawan.txt"));
            read1 = new BufferedReader(new FileReader("avanza.txt"));
            read2 = new BufferedReader(new FileReader("elf.txt"));
            read3 = new BufferedReader(new FileReader("ez pass.txt"));
            read4 = new BufferedReader(new FileReader("grand max.txt"));
            read5 = new BufferedReader(new FileReader("innova.txt"));
            read6 = new BufferedReader(new FileReader("kijang.txt"));
            read7 = new BufferedReader(new FileReader("pelanggan.txt"));
            for (int i = 0; i < karyawan.length; i++) {
                karyawan[i] = new Karyawan();
                karyawan[i].setNama(read.readLine());
                karyawan[i].setNoInduk(read.readLine());
                read.readLine();
            }
            for (int i = 0; i < avanza.length; i++) {
                avanza[i] = new Mobil();
                avanza[i].setJenis(read1.readLine());
                avanza[i].setWarna(read1.readLine());
                avanza[i].setNoPol(read1.readLine());
                avanza[i].setHarga(Double.parseDouble(read1.readLine()));
                read1.readLine();
            }
            for (int i = 0; i < elf.length; i++) {
                elf[i] = new Mobil();
                elf[i].setJenis(read2.readLine());
                elf[i].setWarna(read2.readLine());
                elf[i].setNoPol(read2.readLine());
                elf[i].setHarga(Double.parseDouble(read2.readLine()));
                read2.readLine();
            }
            for (int i = 0; i < ezpass.length; i++) {
                ezpass[i] = new Mobil();
                ezpass[i].setJenis(read3.readLine());
                ezpass[i].setWarna(read3.readLine());
                ezpass[i].setNoPol(read3.readLine());
                ezpass[i].setHarga(Double.parseDouble(read3.readLine()));
                read3.readLine();
            }
            for (int i = 0; i < grandmax.length; i++) {
                grandmax[i] = new Mobil();
                grandmax[i].setJenis(read4.readLine());
                grandmax[i].setWarna(read4.readLine());
                grandmax[i].setNoPol(read4.readLine());
                grandmax[i].setHarga(Double.parseDouble(read4.readLine()));
                read4.readLine();
            }
            for (int i = 0; i < innova.length; i++) {
                innova[i] = new Mobil();
                innova[i].setJenis(read5.readLine());
                innova[i].setWarna(read5.readLine());
                innova[i].setNoPol(read5.readLine());
                innova[i].setHarga(Double.parseDouble(read5.readLine()));
                read5.readLine();
            }
            for (int i = 0; i < kijang.length; i++) {
                kijang[i] = new Mobil();
                kijang[i].setJenis(read6.readLine());
                kijang[i].setWarna(read6.readLine());
                kijang[i].setNoPol(read6.readLine());
                kijang[i].setHarga(Double.parseDouble(read6.readLine()));
                read6.readLine();
            }
            for (int i = 0; i < pelanggan.length; i++) {
                pelanggan[i] = new Pelanggan();
                pelanggan[i].setNama(read7.readLine());
                pelanggan[i].setAlamat(read7.readLine());
                pelanggan[i].setNoTelp(read7.readLine());
                pelanggan[i].setNoSert(read7.readLine());
                pelanggan[i].setKode(read7.readLine());
                read7.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void databaseWrite() {
        BufferedWriter write;

        try {
            write = new BufferedWriter(new FileWriter("pelanggan.txt", true));
            write.write(pelanggan[count - 1].getNama());
            write.newLine();
            write.write(pelanggan[count - 1].getAlamat());
            write.newLine();
            write.write(pelanggan[count - 1].getNoTelp());
            write.newLine();
            write.write(pelanggan[count - 1].getNoSert());
            write.newLine();
            write.write(pelanggan[count - 1].getKode());
            write.newLine();
            write.newLine();
            pelanggan = new Pelanggan[count];
            write.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void databaseWriteFaktur() {
        BufferedWriter write2;
        try {
            write2 = new BufferedWriter(new FileWriter("faktur.txt", true));
            write2.write(tulisFaktur.getNamaPenyewa());
            write2.newLine();
            write2.write(String.valueOf(tulisFaktur.getHarga()));
            write2.newLine();
            write2.write(tulisFaktur.getJenisMobil());
            write2.newLine();
            write2.write(tulisFaktur.getNoPol());
            write2.newLine();
            write2.write(tulisFaktur.getTglPinjam());
            write2.newLine();
            write2.write(String.valueOf(tulisFaktur.getHari()));
            write2.newLine();
            write2.write(tulisFaktur.getTglKembali());
            write2.newLine();
            write2.write(tulisFaktur.getNamaKaryawan());
            write2.newLine();
            write2.newLine();
            write2.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int lineOfTxt(String file) {
        LineNumberReader lnr;
        try {
            lnr = new LineNumberReader(new FileReader(new File(file)));
            lnr.skip(Long.MAX_VALUE);
            return lnr.getLineNumber();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
