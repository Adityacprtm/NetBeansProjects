package Modul4Bab9;
import java.awt.*;
import javax.swing.*;
public class MainFrameNilai {
    public static void main(String[] args) {
        PanelUtama f = new PanelUtama();
        JFrame jp = new JFrame();
        jp.setSize(400, 500);
        jp.setTitle("Hitung Nilai AKhir Dengan GUI");
        jp.add(f);
        jp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBackground(Color.WHITE);
        jp.show();
    }
}
