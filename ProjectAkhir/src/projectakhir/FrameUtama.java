package projectakhir;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class FrameUtama extends JPanel implements ActionListener {

    JPanel beranda;
    JButton menu1, menu2, menu3;
    JPanel frmenu = new JPanel();
    CardLayout layout = new CardLayout();

    public FrameUtama() {
        frmenu.setLayout(layout);
        setLayout(new BorderLayout());

        menu1 = new JButton("INPUT DATA");
        menu1.addActionListener(this);
        menu2 = new JButton("DATA PELANGGAN");
        menu2.addActionListener(this);
        menu3 = new JButton("PENYEWAAN");
        menu3.addActionListener(this);

        beranda = new JPanel();
        beranda.add(menu1);
        beranda.add(menu2);
        beranda.add(menu3);
        frmenu.add(new Frame2(), "menu1");
        frmenu.add(new Frame4(), "menu2");
        frmenu.add(new Frame3(), "menu3");
        beranda.setLayout(new GridLayout(1, 3));

        add(beranda, BorderLayout.NORTH);
        add(frmenu, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "INPUT DATA":
                layout.show(frmenu, "menu1");
                break;
            case "DATA PELANGGAN":
                DataBase a = new DataBase();
                layout.show(frmenu, "menu2");
                break;
            case "PENYEWAAN":
                layout.show(frmenu, "menu3");
                break;
        }
    }
}
