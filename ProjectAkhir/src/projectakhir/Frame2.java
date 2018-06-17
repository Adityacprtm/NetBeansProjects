package projectakhir;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame2 extends JPanel {

    int kodePelanggan;
    JPanel panelCenter, temp1, temp2, panelSouth, msg;
    JLabel lblHeader, lblNama, lblNoTelp, lblAlamat, lblKode, lblNoSert;
    JTextField txtNama, txtNoTelp, txtAlamat, txtKode, txtNoSert;
    JButton btnKode, btnNext;
    int countGenerate = 0;
    int countUpdate = 0;

    public Frame2() {
        setLayout(new GridLayout(3, 1));
        lblHeader = new JLabel("Pendaftaran Pelanggan");
        lblHeader.setFont(new Font("Arial", 1, 18));
        lblHeader.setHorizontalAlignment(JLabel.CENTER);

        lblNama = new JLabel("Nama                             : ");
        lblNoTelp = new JLabel("No. Telepon                  : ");
        lblAlamat = new JLabel("Alamat                           : ");
        lblNoSert = new JLabel("No. Sertifikat Rumah : ");
        lblKode = new JLabel("Kode Pelanggan         : ");
        txtNoTelp = new JTextField(10);
        txtAlamat = new JTextField(10);
        txtKode = new JTextField(10);
        txtKode.setEditable(false);
        txtNoSert = new JTextField(10);
        txtNama = new JTextField(10);

        temp1 = new JPanel(new GridLayout(7, 7));
        temp1.add(lblNama);
        temp1.add(txtNama);
        temp1.add(lblAlamat);
        temp1.add(txtAlamat);
        temp1.add(lblNoTelp);
        temp1.add(txtNoTelp);
        temp1.add(lblNoSert);
        temp1.add(txtNoSert);
        temp1.add(lblKode);
        temp1.add(txtKode);

        panelCenter = new JPanel();
        panelCenter.add(temp1);
        panelCenter.setMaximumSize(new Dimension(100, 100));

        btnKode = new JButton("Generate");
        btnKode.addActionListener(new mainAction());
        btnNext = new JButton("Update");
        btnNext.addActionListener(new mainAction());
        temp2 = new JPanel(new GridLayout(1, 2, 20, 0));
        temp2.add(btnKode);
        temp2.add(btnNext);

        panelSouth = new JPanel();
        panelSouth.add(temp2);
        panelSouth.setMaximumSize(new Dimension(100, 100));

        add(lblHeader);
        add(panelCenter);
        add(panelSouth);

    }

    public int getKode() {
        int kode = 11000;
        DataBase a = new DataBase();
        for (int i = 0; i < a.lineOfTxt("pelanggan.txt") / 6; i++) {
            kode++;
        }
        return kode;
    }

    class mainAction implements ActionListener {

        int kode = 11000;

        @Override
        public void actionPerformed(ActionEvent e) {

            switch (e.getActionCommand()) {
                case "Generate": {
                    if (countGenerate == 0) {
                        kode = getKode();
                        countGenerate++;
                    }
                    txtKode.setText(String.valueOf(kode));
                    kodePelanggan = Integer.parseInt(txtKode.getText());
                    break;
                }
                case "Update": {
                    if (countUpdate == 0) {
                        if (txtKode.getText().equals("")) {
                            JOptionPane.showMessageDialog(null, "Generate Kode Terlebih Dahulu!");
                            break;
                        } else {
                            DataBase b = new DataBase();
                            b.pelanggan[0] = new Pelanggan();
                            b.pelanggan[0].setNama(txtNama.getText());
                            b.pelanggan[0].setKode(txtKode.getText());
                            b.pelanggan[0].setAlamat(txtAlamat.getText());
                            b.pelanggan[0].setNoSert(txtNoSert.getText());
                            b.pelanggan[0].setNoTelp(txtNoTelp.getText());
                            b.databaseWrite();
                            b.DataBase();
                        }
                        countUpdate++;
                    }break;

                }
            }
        }
    }
}
