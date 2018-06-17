package Tugas3;

public class No1 {

    public static void main(String[] args) {
        // nilai = 5, 10, 20
        int nilai = 20;
        if (nilai * 2 < 40) {
            nilai += 5;
        }
        if (nilai <= 10) {
            System.out.println("algoritma ");
            if (nilai % 2 == 1) {
                System.out.println("pemrograman ");
            } else {
                System.out.println("java ");
            }
        } else {
            System.out.println("bukan algoritma ");
            if (nilai % 2 == 1) {
                System.out.println("pemrograman ");
            } else {
                System.out.println("java ");
            }
        }
    }
}
