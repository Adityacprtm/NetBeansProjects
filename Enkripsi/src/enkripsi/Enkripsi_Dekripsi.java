package enkripsi;

import java.util.Scanner;

public class Enkripsi_Dekripsi {

    public static void main(String[] args) {

        /*Caesar Cipher
        Enkripsi : (nomor_karakter_plain_text + key) mod 26
        Dekripsi : (nomor_karakter_cipher_text - key) mod 26
        key : bulan lahir/anything
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kata : ");
        String kata = input.nextLine().toUpperCase();
        int key = 6;
        String[] huruf = new String[26];
        for (char c = 'A'; c <= 'Z'; c++) {
            huruf[c - 65] = String.valueOf(c);
        }
        System.out.println("1. Enkripsi\n2. Dekripsi");
        System.out.print("pilihan : ");
        int x = input.nextInt();

        switch (x) {
            case 1:
                //enkripsi
                String cipher = "";
                loop1:
                for (int a = 0; a < kata.length(); a++) {
                    int index_plain = -1;
                    for (int b = 0; b < huruf.length; b++) {
                        index_plain = (String.valueOf(kata.charAt(a)).equals(huruf[b])) ? b : -1;
                        if (index_plain != -1) {
                            cipher += huruf[(index_plain + key) % 26];
                            continue loop1;
                        }
                    }
                    cipher += kata.charAt(a);
                }
                System.out.println("enkripsi : " + cipher);
                break;
            case 2:
                //dekripsi
                String plaintext = "";
                loop2:
                for (int a = 0; a < kata.length(); a++) {
                    int index_cipher = -1;
                    for (int b = 0; b < huruf.length; b++) {
                        index_cipher = (String.valueOf(kata.charAt(a)).equals(huruf[b])) ? b : -1;
                        if (index_cipher != -1) {
                            plaintext += ((index_cipher - key) >= 0) ? huruf[(index_cipher - key) % 26] : huruf[26 + (index_cipher - key)];
                            continue loop2;
                        }
                    }
                    plaintext += kata.charAt(a);
                }
                System.out.println("dekripsi : " + plaintext);
                break;
        }
    }
}
