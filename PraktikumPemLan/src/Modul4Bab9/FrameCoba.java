package Modul4Bab9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameCoba extends Frame implements ActionListener {

    private JLabel lbJudul;
    private JRadioButton rbPemlan, rbAsd, rbMatkomlan, rbProbsatat;
    private JLabel lbTugas, lbKuis, lbUts, lbUas, lbHasil;
    private JTextField tfTugas, tfKuis, tfUts, tfUas, tfHasil;
    private JButton bHitung;
    private JTextArea taNilai;
    private JButton bTampil;
    private double naPemlan, naAsd, naMatkomlan, naProbstat;

    public FrameCoba() {
        setLayout(new BorderLayout());

        lbJudul = new JLabel("Hitung Nilai Akhir");

        rbPemlan = new JRadioButton("Pemlan");
        rbAsd = new JRadioButton("ASD");
        rbMatkomlan = new JRadioButton("Matkomlan");
        rbProbsatat = new JRadioButton("Probstat");

        lbTugas = new JLabel("Tugas :");
        lbKuis = new JLabel("Kuis :");
        lbUts = new JLabel("UTS :");
        lbUas = new JLabel("UAS :");
        lbHasil = new JLabel("Hasil :");

        tfTugas = new JTextField();
        tfKuis = new JTextField(10);
        tfUts = new JTextField(10);
        tfUas = new JTextField(10);
        tfHasil = new JTextField(10);

        bHitung = new JButton("Hitung");

        taNilai = new JTextArea();

        bTampil = new JButton("Tampilkan Semua Nilai Matkul");

        rbPemlan.addActionListener(this);
        rbAsd.addActionListener(this);
        rbMatkomlan.addActionListener(this);
        rbProbsatat.addActionListener(this);
        bHitung.addActionListener(this);
        bTampil.addActionListener(this);

        ButtonGroup bgGroup = new ButtonGroup();
        bgGroup.add(rbPemlan);
        bgGroup.add(rbAsd);
        bgGroup.add(rbMatkomlan);
        bgGroup.add(rbProbsatat);

        JPanel panelJudul = new JPanel();
        panelJudul.add(lbJudul);

        JPanel panelMk = new JPanel(new GridLayout(1, 4));
        panelMk.add(rbPemlan);
        panelMk.add(rbAsd);
        panelMk.add(rbMatkomlan);
        panelMk.add(rbProbsatat);
        JPanel panelMkGroup = new JPanel();
        panelMkGroup.add(panelMk);

        JPanel panelLabel = new JPanel(new GridLayout(5, 2));
        panelLabel.add(lbKuis);
        panelLabel.add(tfKuis);
        panelLabel.add(lbTugas);
        panelLabel.add(tfTugas);
        panelLabel.add(lbUts);
        panelLabel.add(tfUts);
        panelLabel.add(lbUas);
        panelLabel.add(tfUas);
        panelLabel.add(lbHasil);
        panelLabel.add(tfHasil);
        JPanel panelLabelGroup = new JPanel();
        panelLabelGroup.add(panelLabel);

        JPanel panelHitung = new JPanel();
        panelHitung.add(bHitung);

        JPanel panelTampil = new JPanel();
        panelTampil.add(bTampil);

        JPanel allPanel = new JPanel(new GridLayout(5, 1));
        allPanel.add(panelMkGroup);
        allPanel.add(panelLabelGroup);
        allPanel.add(panelHitung);
        allPanel.add(taNilai);
        allPanel.add(panelTampil);

        JPanel panel = new JPanel();
        panel.add(allPanel);

        add(panelJudul, BorderLayout.PAGE_START);
        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equalsIgnoreCase("Hitung")) {
            double Ntugas = Double.valueOf(tfTugas.getText());
            double Nkuis = Double.valueOf(tfKuis.getText());
            double Nuts = Double.valueOf(tfUts.getText());
            double Nuas = Double.valueOf(tfUas.getText());

            if (rbPemlan.isSelected()) {
                Pemlan pemlan = new Pemlan(Ntugas, Nkuis, Nuts, Nuas);
                naPemlan = pemlan.getNilai();
                tfHasil.setText(String.valueOf(naPemlan));
            } else if (rbAsd.isSelected()) {
                ASD asd = new ASD(Ntugas, Nkuis, Nuts, Nuas);
                naAsd = asd.getNilai();
                tfHasil.setText(String.valueOf(naPemlan));
            } else if (rbMatkomlan.isSelected()) {
                Matkomlan mkl = new Matkomlan(Ntugas, Nkuis, Nuts, Nuas);
                naMatkomlan = mkl.getNilai();
                tfHasil.setText(String.valueOf(naMatkomlan));
            } else if (rbProbsatat.isSelected()) {
                Probstat ps = new Probstat(Ntugas, Nkuis, Nuts, Nuas);
                naProbstat = ps.getNilai();
                tfHasil.setText(String.valueOf(naProbstat));
            }
        } else if (ae.getActionCommand().equalsIgnoreCase("Tampilkan Semua Nilai Matkul")) {
            taNilai.setText("HASIL NILAI SEMUA MATA KULIAH" + "\n" + "Pemlan :" + naPemlan + "\n" + "ASD :" + naAsd + "\n" + "Matkomlan :" + naMatkomlan + "\n" + "Probstat :" + naProbstat);
        } else {
            tfTugas.setText("");
            tfKuis.setText("");
            tfUts.setText("");
            tfUas.setText("");
            tfHasil.setText("");
        }
    }
}
