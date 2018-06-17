package Modul4Bab9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PanelUtama extends JPanel implements ActionListener {
    private Label lbJudul;
    private JRadioButton rbPemlan, rbAsd, rbMatkomlan, rbProbsatat;
    private Label lbTugas, lbKuis, lbUts, lbUas, lbHasil, lbMaker;
    private TextField tfTugas, tfKuis, tfUts, tfUas, tfHasil;
    private Button bHitung;
    private TextArea taNilai;
    private Button bTampil;
    private double naPemlan, naAsd, naMatkomlan, naProbstat;
    public PanelUtama() {
        setLayout(null);
//JUDUL
        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", 1, 16));
        add(lbJudul);
        lbJudul.setBounds(120, 10, 170, 20);
//PILIH MATKUL
        rbAsd = new JRadioButton("ASD");
        rbAsd.setBackground(null);
        rbPemlan = new JRadioButton("Pemlan");
        rbPemlan.setBackground(null);
        rbMatkomlan = new JRadioButton("Matkomlan");
        rbMatkomlan.setBackground(null);
        rbProbsatat = new JRadioButton("Probstat");
        rbProbsatat.setBackground(null);
        ButtonGroup bgGroup = new ButtonGroup();
        bgGroup.add(rbAsd);
        bgGroup.add(rbPemlan);
        bgGroup.add(rbMatkomlan);
        bgGroup.add(rbProbsatat);
        add(rbAsd);
        add(rbPemlan);
        add(rbMatkomlan);
        add(rbProbsatat);
        rbPemlan.setBounds(20, 40, 90, 20);
        rbAsd.setBounds(110, 40, 90, 20);
        rbMatkomlan.setBounds(200, 40, 90, 20);
        rbProbsatat.setBounds(290, 40, 90, 20);
        rbAsd.addActionListener(this);
        rbPemlan.addActionListener(this);
        rbMatkomlan.addActionListener(this);
        rbProbsatat.addActionListener(this);
//LABEL MATKUL
        lbTugas = new Label("Tugas :");
        lbKuis = new Label("Kuis :");
        lbUts = new Label("UTS :");
        lbUas = new Label("UAS :");
        lbHasil = new Label("Hasil :");
        add(lbTugas);
        add(lbKuis);
        add(lbUts);
        add(lbUas);
        add(lbHasil);
        lbTugas.setBounds(115, 70, 90, 20);
        lbKuis.setBounds(115, 100, 90, 20);
        lbUts.setBounds(115, 130, 90, 20);
        lbUas.setBounds(115, 160, 90, 20);
        lbHasil.setBounds(115, 190, 90, 20);
//INPUT NILAI
        tfTugas = new TextField();
        tfKuis = new TextField();
        tfUts = new TextField();
        tfUas = new TextField();
        tfHasil = new TextField();
        add(tfTugas);
        add(tfKuis);
        add(tfUts);
        add(tfUas);
        add(tfHasil);
        tfTugas.setBounds(210, 70, 70, 20);
        tfKuis.setBounds(210, 100, 70, 20);
        tfUts.setBounds(210, 130, 70, 20);
        tfUas.setBounds(210, 160, 70, 20);
        tfHasil.setBounds(210, 190, 70, 20);
//TOMBOL HITUNG
        bHitung = new Button("Hitung");
        bHitung.addActionListener(this);
        add(bHitung);
        bHitung.setBounds(140, 220, 100, 20);
//OUTPUT
        taNilai = new TextArea();
        add(taNilai);
        taNilai.setBounds(40, 250, 300, 150);
//TOMBOL TAMPILKAN SEMUA
        bTampil = new Button("Tampilkan Semua Nilai Matkul");
        bTampil.addActionListener(this);
        add(bTampil);
        bTampil.setBounds(40, 410, 300, 20);
//NAMA NIM
        lbMaker = new Label("ADITYA CHAMIM PRATAMA - 155150207111081");
        lbMaker.setFont(new Font("Arial", 1, 10));
        add(lbMaker);
        lbMaker.setBounds(70, 440, 265, 20);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equalsIgnoreCase("Hitung")) {
            double tugas = Double.valueOf(tfTugas.getText());
            double kuis = Double.valueOf(tfKuis.getText());
            double uts = Double.valueOf(tfUts.getText());
            double uas = Double.valueOf(tfUas.getText());
            if (rbAsd.isSelected()) {
                ASD asd = new ASD(tugas, kuis, uts, uas);
                naAsd = asd.getNilai();
                tfHasil.setText(String.valueOf(naAsd));
            } else if (rbPemlan.isSelected()) {
                Pemlan pl = new Pemlan(tugas, kuis, uts, uas);
                naPemlan = pl.getNilai();
                tfHasil.setText(String.valueOf(naPemlan));
            } else if (rbMatkomlan.isSelected()) {
                Matkomlan mkl = new Matkomlan(tugas, kuis, uts, uas);
                naMatkomlan = mkl.getNilai();
                tfHasil.setText(String.valueOf(naMatkomlan));
            } else if (rbProbsatat.isSelected()) {
                Probstat ps = new Probstat(tugas, kuis, uts, uas);
                naProbstat = ps.getNilai();
                tfHasil.setText(String.valueOf(naProbstat));
            }
        } else if (ae.getActionCommand().equalsIgnoreCase("Tampilkan Semua Nilai Matkul")) {
            taNilai.setText("HASIL NILAI SEMUA MATA KULIAH" + "\n\n" + "Pemlan :" + naPemlan + "\n" + "ASD :" + naAsd + "\n" + "Matkomlan :" + naMatkomlan + "\n" + "Probstat :" + naProbstat);
        } else {
            tfTugas.setText("");
            tfKuis.setText("");
            tfUts.setText("");
            tfUas.setText("");
            tfHasil.setText("");
        }
    }
}