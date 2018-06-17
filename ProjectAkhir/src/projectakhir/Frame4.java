package projectakhir;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame4 extends JPanel {

    DataBase a = new DataBase();
    JPanel panelCenter, temp1, temp2, panelSouth, msg;
    JLabel lblHeader, lblNama, lblNoTelp, lblAlamat, lblKode, lblNoSert, lblPilih;
    JTextField txtNama, txtNoTelp, txtAlamat, txtKode, txtNoSert;
    JComboBox kode;
    private String kodePelanggan[] = new String[a.lineOfTxt("pelanggan.txt") / 6 + 1];

    public Frame4() {
        for (int i = 1; i < kodePelanggan.length; i++) {
            kodePelanggan[i] = a.pelanggan[i - 1].getKode();
        }

        setLayout(new GridLayout(3, 1));
        lblHeader = new JLabel("Data Pelanggan");
        lblHeader.setFont(new Font("Arial", 1, 18));
        lblHeader.setHorizontalAlignment(JLabel.CENTER);

        lblNama = new JLabel("Nama                             : ");
        lblNoTelp = new JLabel("No. Telepon                  : ");
        lblAlamat = new JLabel("Alamat                           : ");
        lblNoSert = new JLabel("No. Sertifikat Rumah : ");
        lblKode = new JLabel("Kode Pelanggan         : ");
        lblPilih = new JLabel("Pilih Kode Pelanggan : ");

        txtNoTelp = new JTextField(10);
        txtNoTelp.setEditable(false);
        txtAlamat = new JTextField(10);
        txtAlamat.setEditable(false);
        txtKode = new JTextField(10);
        txtKode.setEditable(false);
        txtNoSert = new JTextField(10);
        txtNoSert.setEditable(false);
        txtNama = new JTextField(10);
        txtNama.setEditable(false);
        kode = new JComboBox(kodePelanggan);

        temp1 = new JPanel(new GridLayout(7, 7));
        temp1.add(lblPilih);
        temp1.add(kode);
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

        add(lblHeader);
        add(panelCenter);
        kode.addActionListener(new Frame4.mainAction());
    }

    class mainAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if (kode.getSelectedIndex() == 0) {
                txtNama.setText("");
                txtAlamat.setText("");
                txtNoTelp.setText("");
                txtNoSert.setText("");
                txtKode.setText("");
            }
            for (int i = 1; i < kodePelanggan.length+1; i++) {
                if (kode.getSelectedItem().toString().equals(a.pelanggan[i - 1].getKode())) {
                    txtNama.setText(a.pelanggan[i - 1].getNama());
                    txtAlamat.setText(a.pelanggan[i - 1].getAlamat());
                    txtNoTelp.setText(a.pelanggan[i - 1].getNoTelp());
                    txtNoSert.setText(a.pelanggan[i - 1].getNoSert());
                    txtKode.setText(a.pelanggan[i - 1].getKode());
                }
            }
        }
    }
}
