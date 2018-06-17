package Tugas4;

import static Tugas4.Find.find;
import static Tugas4.Find.findGenericNumber;
import java.util.ArrayList;

public class MainFind {

    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        x.add(new String("Aku"));
        x.add(new String("Kamu"));
        x.add(new String("Dia"));
        System.out.println(find(x, 1) + "\n");

        ArrayList a = new ArrayList();
        a.add(new Integer(1));
        a.add(new Integer(2));
        a.add(new Integer(3));
        System.out.println(findGenericNumber(a, 4));
    }
}
