package projectakhir;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame1 extends JPanel {

    JPanel panel1, panelCenter, panel4, panelSouth;
    JLabel label1, lblId;
    JTextField txtKode;
    JButton btnLogin;
    private static Karyawan karyawan;
    private boolean login = false;

    public Frame1() {
        setLayout(new GridLayout(3, 1));

        label1 = new JLabel("LOGIN KARYAWAN");
        label1.setFont(new Font("Arial", 1, 18));
        label1.setHorizontalAlignment(JLabel.CENTER);
        add(label1);
        lblId = new JLabel("ID : ");
        txtKode = new JTextField(10);
        btnLogin = new JButton("Login");
        btnLogin.addActionListener(new mainAction());

        panel1 = new JPanel(new GridLayout(1, 2));
        panel1.add(lblId);
        panel1.add(txtKode);

        panelCenter = new JPanel();
        panelCenter.add(panel1, BorderLayout.CENTER);
        panelCenter.setMaximumSize(new Dimension(100, 100));

        panel4 = new JPanel(new BorderLayout());
        panel4.add(btnLogin, BorderLayout.SOUTH);
        panel4.setMaximumSize(new Dimension(100, 100));

        panelSouth = new JPanel();
        panelSouth.add(panel4);

        add(panelCenter);
        add(panelSouth);
    }

    public static Karyawan getKaryawan() {
        return karyawan;
    }

    class mainAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            DataBase b = new DataBase();
            Karyawan[] k = new Karyawan[2];
            k = b.getKaryawan();
            for (int i = 0; i < k.length; i++) {
                if (k[i].getNoInduk().equals(txtKode.getText())) {
                    JOptionPane.showMessageDialog(null, "Login Berhasil!\n" + k[i].getNama());
                    karyawan = new Karyawan();
                    karyawan = k[i];
                    FrameUtama x = new FrameUtama();
                    JFrame frame = new JFrame();
                    frame.setSize(700, 450);
                    frame.add(x);
                    frame.setVisible(true);
                    frame.setTitle("PENYEWAAN MOBIL 4/20");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    login = true;
                    break;
                }

            }
            if (login == false) {
                JOptionPane.showMessageDialog(null, "Login Gagal!");
            }
        }
    }

}
