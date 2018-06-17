package latihan;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        int a;
        Scanner mlebu=new Scanner(System.in);
        System.out.print("Masukan Nilai\t= ");
        a=mlebu.nextInt();
        if (a>=60) {
            System.out.println("Mahasiswa Lulus");
        }else {
            System.out.println("Mahasiswa Tidak Lulus");
        }
    }
    
}
