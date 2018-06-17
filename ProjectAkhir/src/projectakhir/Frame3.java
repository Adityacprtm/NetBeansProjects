package projectakhir;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class Frame3 extends JPanel {

    JPanel panelCenter, panelSouth, temp1, temp2, temp3, temp4, temp5, temp6, temp7;
    JLabel lblHeader, lblKode, lblTgl, lblWaktu, lblSupir;
    JRadioButton[] rbt = new JRadioButton[6];
    JRadioButton rbtYa, rbtTidak;
    JTextField txtKode;
    JFormattedTextField txtTgl, txtBulan, txtTahun;
    JComboBox hari;
    JButton btnNext, btnData;
    ButtonGroup group1, group2;
    private String[] jmlhHari = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
    int MobilAvanzaKe = 0, MobilInovaKe = 0, MobilEzpassKe = 0, MobilGrandKe = 0, MobilElfKe = 0, MobilKijangKe = 0;
    boolean next = true;
    int blok[] = {0, 0, 0, 0, 0, 0};
    DataBase a = new DataBase();
    Mobil avanza[] = a.getAvanza();
    Mobil innova[] = a.getInnova();
    Mobil elf[] = a.getElf();
    Mobil ezpass[] = a.getEzpass();
    Mobil kijang[] = a.getKijang();
    Mobil grand[] = a.getGrandmax();

    public Frame3() {
        setLayout(new GridLayout(3, 1));
        lblHeader = new JLabel("Penyewaan");
        lblHeader.setFont(new Font("Arial", 1, 18));
        lblHeader.setHorizontalAlignment(JLabel.CENTER);
        lblKode = new JLabel("Kode Pelanggan");
        lblTgl = new JLabel("Tanggal Peminjaman");
        lblWaktu = new JLabel("Lama Peminjaman");
        lblSupir = new JLabel("Pakai Supir ?");
        rbt[0] = new JRadioButton("Avanza", true);
        rbt[1] = new JRadioButton("Innova");
        rbt[2] = new JRadioButton("Ezpass");
        rbt[3] = new JRadioButton("Grand Max");
        rbt[4] = new JRadioButton("Elf");
        rbt[5] = new JRadioButton("Kijang");
        rbtYa = new JRadioButton("Ya");
        rbtTidak = new JRadioButton("Tidak", true);
        hari = new JComboBox(jmlhHari);
        txtKode = new JTextField(10);

        Date tgl = new Date();
        NumberFormat tanggal = NumberFormat.getInstance();
        tanggal.setMaximumIntegerDigits(2);
        NumberFormat tahun = NumberFormat.getInstance();
        tahun.setMaximumIntegerDigits(4);
        tahun.setGroupingUsed(false);
        txtTgl = new JFormattedTextField(tanggal);
        txtTgl.setText(String.valueOf(tgl.getDate()));
        txtBulan = new JFormattedTextField(tanggal);
        txtBulan.setText(String.valueOf(tgl.getMonth() + 1));
        txtTahun = new JFormattedTextField(tahun);
        txtTahun.setText(String.valueOf(tgl.getYear() + 1900));

        temp1 = new JPanel(new GridLayout(1, 4));
        temp1.add(lblTgl);
        temp1.add(txtTgl);
        temp1.add(txtBulan);
        temp1.add(txtTahun);

        temp2 = new JPanel(new GridLayout(1, 3));
        temp2.add(lblSupir);
        temp2.add(rbtYa);
        temp2.add(rbtTidak);

        temp3 = new JPanel(new GridLayout(1, 6));
        temp3.add(rbt[0]);
        temp3.add(rbt[1]);
        temp3.add(rbt[2]);
        temp3.add(rbt[3]);
        temp3.add(rbt[4]);
        temp3.add(rbt[5]);

        temp4 = new JPanel(new GridLayout(1, 2));
        temp4.add(lblKode);
        temp4.add(txtKode);

        temp5 = new JPanel(new GridLayout(1, 2));
        temp5.add(lblWaktu);
        temp5.add(hari);

        temp6 = new JPanel(new GridLayout(8, 2));
        temp6.add(temp3);
        temp6.add(temp4);
        temp6.add(temp1);
        temp6.add(temp5);
        temp6.add(temp2);

        btnNext = new JButton("Next");
        btnData = new JButton("Data Pelanggan");

        temp7 = new JPanel(new GridLayout(1, 2, 100, 0));
        temp7.add(btnData);
        temp7.add(btnNext);

        panelCenter = new JPanel();
        panelCenter.add(temp6);
        panelCenter.setMaximumSize(new Dimension(100, 100));

        panelSouth = new JPanel();
        panelSouth.add(temp7);
        panelSouth.setMaximumSize(new Dimension(100, 100));

        add(lblHeader);
        add(panelCenter);
        add(panelSouth);

        group1 = new ButtonGroup();
        group1.add(rbt[0]);
        group1.add(rbt[1]);
        group1.add(rbt[2]);
        group1.add(rbt[3]);
        group1.add(rbt[4]);
        group1.add(rbt[5]);

        group2 = new ButtonGroup();
        group2.add(rbtYa);
        group2.add(rbtTidak);

        btnData.addActionListener(new Frame3.mainAction());
        btnNext.addActionListener(new Frame3.mainAction());
    }

    class mainAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            switch (e.getActionCommand()) {
                case "Data Pelanggan": {

                    Frame4 x = new Frame4();
                    JFrame frame = new JFrame();
                    frame.add(x);
                    frame.setVisible(true);
                    frame.pack();
                    frame.setResizable(true);
                    break;
                }
                case "Next": {
                    int thn = Integer.parseInt(txtTahun.getText());
                    int bln = Integer.parseInt(txtBulan.getText());
                    int tgl = Integer.parseInt(txtTgl.getText());
                    Date tglPinjam = new Date(thn - 1900, bln - 1, tgl);
                    Date tglKembali = new Date(thn - 1900, bln - 1, tgl + hari.getSelectedIndex());
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
                    int biayaSupir = 0;
                    double harga = 0;
                    Mobil mobilFaktur = new Mobil();
                    Pelanggan pelangganFaktur = new Pelanggan();
                    if (txtKode.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Kode Pelanggan Tidak Boleh Kosong");
                        break;
                    }
                    for (int i = 0; i < a.lineOfTxt("pelanggan.txt") / 6; i++) {
                        if (txtKode.getText().equals(a.pelanggan[i].getKode())) {
                            pelangganFaktur = a.pelanggan[i];
                        }
                    }
                    if (rbtYa.isSelected()) {
                        biayaSupir = 50000;
                    }

                    if (rbt[0].isSelected()) {
                        harga = (avanza[MobilAvanzaKe].getHarga() * 2 + biayaSupir) * hari.getSelectedIndex();
                        mobilFaktur = avanza[MobilAvanzaKe];
                        MobilAvanzaKe++;
                        if (MobilAvanzaKe >= 3) {
                            rbt[0].setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Mobil terakhir jenis ini. ganti jenis mobil lain");
                            btnNext.setEnabled(false);
                            blok[0] = 1;
                        }
                    } else if (rbt[1].isSelected()) {
                        harga = (innova[MobilInovaKe].getHarga() * 2 + biayaSupir) * hari.getSelectedIndex();
                        mobilFaktur = innova[MobilInovaKe];
                        MobilInovaKe++;
                        if (MobilInovaKe >= 3) {
                            rbt[1].setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Mobil terakhir jenis ini. ganti jenis mobil lain");
                            btnNext.setEnabled(false);
                            blok[1] = 1;
                        }
                    } else if (rbt[2].isSelected()) {
                        harga = (ezpass[MobilEzpassKe].getHarga() * 2 + biayaSupir) * hari.getSelectedIndex();
                        mobilFaktur = ezpass[MobilEzpassKe];
                        MobilEzpassKe++;
                        if (MobilEzpassKe >= 3) {
                            rbt[2].setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Mobil terakhir jenis ini. ganti jenis mobil lain");
                            btnNext.setEnabled(false);
                            blok[2] = 1;
                        }
                    } else if (rbt[3].isSelected()) {
                        harga = (grand[MobilGrandKe].getHarga() * 2 + biayaSupir) * hari.getSelectedIndex();
                        mobilFaktur = grand[MobilGrandKe];
                        MobilGrandKe++;
                        if (MobilGrandKe >= 3) {
                            rbt[3].setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Mobil terakhir jenis ini. ganti jenis mobil lain");
                            btnNext.setEnabled(false);
                            blok[3] = 1;
                        }
                    } else if (rbt[4].isSelected()) {
                        harga = (elf[MobilElfKe].getHarga() * 2 + biayaSupir) * hari.getSelectedIndex();
                        mobilFaktur = elf[MobilElfKe];
                        MobilElfKe++;
                        if (MobilElfKe >= 3) {
                            rbt[4].setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Mobil terakhir jenis ini. ganti jenis mobil lain");
                            btnNext.setEnabled(false);
                            blok[4] = 1;
                        }
                    } else if (rbt[5].isSelected()) {
                        harga = (kijang[MobilKijangKe].getHarga() * 2 + biayaSupir) * hari.getSelectedIndex();
                        mobilFaktur = kijang[MobilKijangKe];
                        MobilKijangKe++;
                        if (MobilKijangKe >= 3) {
                            rbt[5].setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Mobil terakhir jenis ini. ganti jenis mobil lain");
                            btnNext.setEnabled(false);
                            blok[5] = 1;
                        }
                    }
                    if (next == true) {
                        JOptionPane.showMessageDialog(null,
                                "\nnama penyewa : " + pelangganFaktur.getNama()
                                + "\nharga yang dibayar : " + harga
                                + "\njenis mobil : " + mobilFaktur.getJenis()
                                + "\nplat nomor : " + mobilFaktur.getNoPol()
                                + "\ntanggal peminjaman : " + sdf.format(tglPinjam)
                                + "\nlama peminjaman : " + hari.getSelectedIndex() + " hari"
                                + "\ntanggal pengembalian : " + sdf.format(tglKembali)
                                + "\nkaryawan : " + Frame1.getKaryawan().getNama()
                                + "\n\nS U K S E S");
                        a.tulisFaktur = new Faktur(pelangganFaktur.getNama(), harga, mobilFaktur.getJenis(),
                                mobilFaktur.getNoPol(), sdf.format(tglPinjam), hari.getSelectedIndex(),
                                sdf.format(tglKembali), Frame1.getKaryawan().getNama());
                        a.databaseWriteFaktur();
                    }

                    if (btnNext.isEnabled() == false) {
                        for (int k = 0; k < 6; k++) {
                            if (blok[k] == 0) {
                                btnNext.setEnabled(true);
                                rbt[k].setSelected(true);
                                break;
                            }
                        }
                    }
                    break;
                }
            }
        }
    }
}
