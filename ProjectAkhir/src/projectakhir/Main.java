package projectakhir;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        Frame1 fr1 = new Frame1();
        JFrame frame = new JFrame();
        frame.add(fr1);
        frame.setSize(700, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("PENYEWAAN MOBIL 4/20");
        frame.setVisible(true);
    }
}
