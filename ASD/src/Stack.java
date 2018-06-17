

import java.util.Scanner;

public class Stack {

    private int size;
    private int counter = -1;
    private int[] data;

    public Stack(int dt) {
        this.size = dt;
        data = new int[size];
    }

    public boolean kosong() {
        return counter == -1 ? true : false;
    }

    public boolean penuh() {
        return counter == (size - 1) ? true : false;
    }

    public void push(int dt) {
        if (!penuh()) {
            data[++counter] = dt;
        }
    }

    public int pop() {
        int hasil = -999;
        if (!kosong()) {
            hasil = data[counter--];
        }
        return hasil;
    }

    public void cetak() {
        for (int i = counter; i > -1; i--) {
            System.out.print(data[i]);
        }
        System.out.println();
    }

    public void decimal2Octal(int nilai) {
        Stack s = new Stack(100);
        while (nilai != 0) {
            int sisa = nilai % 8;
            s.push(sisa);
            nilai = nilai / 8;
        }
        while (!s.kosong()) {
            System.out.print(s.pop());
        }
    }

    public void decimal2Biner(int nilai) {
        Stack s = new Stack(100);
        while (nilai != 0) {
            int sisa = nilai % 2;
            s.push(sisa);
            nilai = nilai / 2;
        }
        while (!s.kosong()) {
            System.out.print(s.pop());
        }
    }

    public void biner2Decimal(int biner) {
        //BAGIAN INI BELUM LENGKAP
        String st = Integer.toString(biner);
        String ar[] = new String[st.length()];
        ar = st.split(st);
    }

    public void octal2Decimal(int octal) {
        //BAGIAN INI BELUM LENGKAP
    }

    public static void main(String[] args) {
        Stack s = new Stack(100);
        s.biner2Decimal(10);
        int pilih;
        Scanner in = new Scanner(System.in);
        System.out.println("MENU\n1.Decimal->Biner\n2.Decimal->Octal\n3.Biner->Decimal\n4.Octal->Decimal\n=================");
        do {
            System.out.print("pilih : ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("nilai : ");
                    int DB = in.nextInt();
                    s.decimal2Biner(DB);
                    System.out.println("\n=================");
                    break;
                case 2:
                    System.out.print("nilai : ");
                    int DO = in.nextInt();
                    s.decimal2Octal(DO);
                    System.out.println("\n=================");
                    break;
                case 3:
                    System.out.print("nilai : ");
                    int BD = in.nextInt();
                    s.biner2Decimal(BD);
                    System.out.println("\n=================");
                    break;
                case 4:
                    System.out.print("nilai : ");
                    int OD = in.nextInt();
                    s.octal2Decimal(OD);
                    System.out.println("\n=================");
                    break;
                case 5:
                    System.out.println("Program dihentikan..");
                    break;
            }
        } while (pilih != 5);

    }
}
