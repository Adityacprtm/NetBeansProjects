package gui;

import java.awt.*;

class FlowLayoutDemo extends Frame {

    public static void main(String args[]) {
        FlowLayoutDemo fld = new FlowLayoutDemo();
        fld.setLayout(new FlowLayout(FlowLayout.CENTER, 2,10));
        fld.add(new Button("ONE"));
        fld.add(new Button("TWO"));
        fld.add(new Button("THREE"));
        fld.setSize(200, 200);
        fld.setVisible(true);
    }
}
