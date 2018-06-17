package praktikumpemlan;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FrameNilai1 extends JPanel implements ActionListener {

    private JLabel judul, credit;
    private JRadioButton ASD, pemlan, matkomlan, probstat;
    private JLabel tugas, kuis, uts, uas, hasil;
    private JButton hitung;
    private JTextArea nilai;
    private JButton tampilkan;
    private JTextField isiTugas, isiKuis, isiUTS, isiUAS, isiHasil;
    private JPanel panelMatkul, panelJudul, temp, panelLabel, temp1, panelUtama, temp2, panelHitung, panelTampilkan;
    private ButtonGroup check;
    private double naASD, naMatkomlan, naPemlan, naProbstat;
//    private ASD a;
//    private pemlan b;
//    private matkomlan c;
//    private probstat d;

    public FrameNilai1() {

        setLayout(new BorderLayout());

        judul = new JLabel("Hitung Nilai Akhir");
        ASD = new JRadioButton("ASD");
        pemlan = new JRadioButton("Pemlan");
        matkomlan = new JRadioButton("Matkomlan");
        probstat = new JRadioButton("Probstat");
        tugas = new JLabel("Tugas :");
        kuis = new JLabel("Kuis :");
        uts = new JLabel("UTS  :");
        uas = new JLabel("UAS  :");
        hasil = new JLabel("Hasil :");
        hitung = new JButton("Hitung");
        nilai = new JTextArea();
        tampilkan = new JButton("Tampilkan Semua Nilai Matkul");
        isiTugas = new JTextField(15);
        isiKuis = new JTextField(15);
        isiUTS = new JTextField(15);
        isiUAS = new JTextField(15);
        isiHasil = new JTextField(15);
        check = new ButtonGroup();

        ASD.addActionListener(this);
        pemlan.addActionListener(this);
        matkomlan.addActionListener(this);
        probstat.addActionListener(this);

        hitung.addActionListener(this);
        tampilkan.addActionListener(this);

        isiHasil.setEditable(false);
        nilai.setEditable(false);
        nilai.setBorder(BorderFactory.createEtchedBorder());

        panelJudul = new JPanel();
        panelJudul.add(judul);

        check.add(ASD);
        check.add(pemlan);
        check.add(matkomlan);
        check.add(probstat);

        panelMatkul = new JPanel(new GridLayout(1, 4));
        panelMatkul.add(ASD);
        panelMatkul.add(pemlan);
        panelMatkul.add(matkomlan);
        panelMatkul.add(probstat);

        temp = new JPanel();
        temp.add(panelMatkul);

        panelLabel = new JPanel(new GridLayout(5, 2));
        panelLabel.add(tugas);
        panelLabel.add(isiTugas);
        panelLabel.add(kuis);
        panelLabel.add(isiKuis);
        panelLabel.add(uts);
        panelLabel.add(isiUTS);
        panelLabel.add(uas);
        panelLabel.add(isiUAS);
        panelLabel.add(hasil);
        panelLabel.add(isiHasil);

        temp1 = new JPanel();
        temp1.add(panelLabel);

        panelHitung = new JPanel();
        panelHitung.add(hitung);

        panelTampilkan = new JPanel();
        panelTampilkan.add(tampilkan);

        panelUtama = new JPanel(new GridLayout(5, 1));
        panelUtama.add(temp);
        panelUtama.add(panelLabel);
        panelUtama.add(panelHitung);
        panelUtama.add(nilai);
        panelUtama.add(panelTampilkan);

        temp2 = new JPanel();
        temp2.add(panelUtama);

        credit = new JLabel("*Muhammad Isradi Azhar - 145150201111037");
        add(panelJudul, BorderLayout.PAGE_START);
        add(temp2, BorderLayout.CENTER);
        add(credit, BorderLayout.PAGE_END);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equalsIgnoreCase("Hitung")) {
            int Ntugas = Integer.valueOf(isiTugas.getText());
            int Nkuis = Integer.valueOf(isiKuis.getText());
            int Nuts = Integer.valueOf(isiUTS.getText());
            int Nuas = Integer.valueOf(isiUAS.getText());

//            if (ASD.isSelected()) {
//                a = new ASD(Ntugas, Nkuis, Nuts, Nuas);
//                naASD = a.getNilai();
//                isiHasil.setText(String.valueOf(naASD));
//            } else if (pemlan.isSelected()) {
//                b = new pemlan(Ntugas, Nkuis, Nuts, Nuas);
//                naPemlan = b.getNilai();
//                isiHasil.setText(String.valueOf(naPemlan));
//            } else if (matkomlan.isSelected()) {
//                c = new matkomlan(Ntugas, Nkuis, Nuts, Nuas);
//                naMatkomlan = c.getNilai();
//                isiHasil.setText(String.valueOf(naMatkomlan));
//            } else if (probstat.isSelected()) {
//                d = new probstat(Ntugas, Nkuis, Nuts, Nuas);
//                naProbstat = d.getNilai();
//                isiHasil.setText(String.valueOf(naProbstat));
//            }
        } else if (e.getActionCommand().equalsIgnoreCase("Tampilkan Semua Nilai Matkul")) {
            nilai.setText("HASIL NILAI SEMUA MATA KULIAH" + "\n" + "ASD :" + naASD + "\n" + "Pemlan :" + naPemlan + "\n" + "Matkomlan :" + naMatkomlan + "\n" + "Probstat :" + naProbstat);
        } else {
            isiTugas.setText("");
            isiKuis.setText("");
            isiUTS.setText("");
            isiUAS.setText("");
            isiHasil.setText("");
        }
    }

}
