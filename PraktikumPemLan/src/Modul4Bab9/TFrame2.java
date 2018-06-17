package Modul4Bab9;
import java.awt.*;
import java.awt.event.*;
public class TFrame2 extends Frame {
    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    CheckboxGroup cbg;
    Checkbox cbNilaiAngka, cbNilaiHuruf;
    public TFrame2() {
        setLayout(null);
        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(100, 30, 170, 20);
        lbTugas = new Label("Tugas : ");
        add(lbTugas);
        lbTugas.setBounds(100, 60, 62, 20);
        lbKuis = new Label("Kuis : ");
        add(lbKuis);
        lbKuis.setBounds(100, 90, 70, 20);
        lbUTS = new Label("UTS : ");
        add(lbUTS);
        lbUTS.setBounds(100, 120, 70, 20);
        lbUAS = new Label("UAS : ");
        add(lbUAS);
        lbUAS.setBounds(100, 150, 70, 20);
        lbHasil = new Label("Hasil : ");
        add(lbHasil);
        lbHasil.setBounds(100, 180, 70, 20);
        txtTugas = new TextField("0");
        add(txtTugas);
        txtTugas.setBounds(200, 60, 60, 20);
        txtKuis = new TextField("0");
        add(txtKuis);
        txtKuis.setBounds(200, 90, 60, 20);
        txtUTS = new TextField("0");
        add(txtUTS);
        txtUTS.setBounds(200, 120, 60, 20);
        txtUAS = new TextField("0");
        add(txtUAS);
        txtUAS.setBounds(200, 150, 60, 20);
        txtHasil = new TextField("0");
        add(txtHasil);
        txtHasil.setBounds(200, 180, 60, 20);
        cbg = new CheckboxGroup();
        cbNilaiHuruf = new Checkbox("Nilai Huruf", cbg, false);
        this.add(cbNilaiHuruf).setBounds(100, 220, 90, 20);
        cbNilaiAngka = new Checkbox("Nilai Angka", cbg, false);
        this.add(cbNilaiAngka).setBounds(200, 220, 90, 20);
        cbNilaiHuruf.addItemListener(new mainAction());
        cbNilaiAngka.addItemListener(new mainAction());
    }
    class mainAction implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            int tugas = Integer.parseInt(txtTugas.getText().trim());
            int kuis = Integer.parseInt(txtKuis.getText().trim());
            int UTS = Integer.parseInt(txtUTS.getText().trim());
            int UAS = Integer.parseInt(txtUAS.getText().trim());
            String hasil = String.valueOf(tugas / 4 + kuis / 4 + UTS / 4 + UAS / 4);
            Object source = e.getItemSelectable();
            if (source == cbNilaiAngka) {
                txtHasil.setText(hasil);
            } else if (source == cbNilaiHuruf) {
                double nilaiAngka = Double.parseDouble(hasil);
                String nilaiHuruf = "";
                if (nilaiAngka >= 80 && nilaiAngka <= 100) {
                    nilaiHuruf = "A";
                } else if (nilaiAngka >= 75 && nilaiAngka <= 80) {
                    nilaiHuruf = "B+";
                } else if (nilaiAngka >= 65 && nilaiAngka <= 74) {
                    nilaiHuruf = "B";
                } else if (nilaiAngka >= 60 && nilaiAngka <= 64) {
                    nilaiHuruf = "C+";
                } else if (nilaiAngka >= 50 && nilaiAngka <= 59) {
                    nilaiHuruf = "C";
                } else if (nilaiAngka >= 45 && nilaiAngka <= 49) {
                    nilaiHuruf = "D+";
                } else if (nilaiAngka >= 35 && nilaiAngka <= 40) {
                    nilaiHuruf = "D";
                } else if (nilaiAngka <= 35) {
                    nilaiHuruf = "E";
                }
                txtHasil.setText("" + nilaiHuruf); //menampilkan “nilaiHuruf” pada txtHasil
            }
        }
    }
    public static void main(String[] args) {
        TFrame2 window = new TFrame2();
        window.setTitle("Hitung Nilai Akhir dengan GUI java.awt");
        window.setSize(350, 300);
        window.show();
    }
}
