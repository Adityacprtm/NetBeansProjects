package Modul3Bab8;
import java.util.Scanner;
public class MainAlatMusik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, pilih, jml;
        System.out.print("JUMLAH ALAT MUSIK : ");
        jml = input.nextInt();
        AlatMusik musik[] = new AlatMusik[jml];
        do {
            if (jml == 0) {
                jml = 0;
            } else {
                jml -= 1;
                System.out.print("===========================\nM E N U\n1. ALAT MUSIK PETIK\n2. ALAT MUSIK TIUP\nPilih : ");
                pilih = input.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.print("1. GITAR\n2. UKULELE\nPilih : ");
                        int pilih1 = input.nextInt();
                        System.out.print("Bahan : ");
                        String bhn = input.next();
                        System.out.print("Nada DO (A,B,C,D,E,F,G) : ");
                        String nd = input.next();
                        switch (pilih1) {
                            case 1:
                                musik[i] = new Gitar(bhn, nd);
                                System.out.println("--> SUKSES");break;
                            case 2:
                                musik[i] = new Ukulele(bhn, nd);
                                System.out.println("--> SUKSES");break;
                            default:
                                System.out.println("Pilahan tidak tersedia");break;
                        }i += 1;break;
                    case 2:
                        System.out.print("1. HARMONIKA\n2. SAXOPHONE\nPilih : ");
                        int pilih2 = input.nextInt();
                        System.out.print("Bahan : ");
                        String bhn1 = input.next();
                        System.out.print("Nada DO (A,B,C,D,E,F,G): ");
                        String nd1 = input.next();
                        switch (pilih2) {
                            case 1:
                                musik[i] = new Harmonika(bhn1, nd1);
                                System.out.println("--> SUKSES");break;
                            case 2:
                                musik[i] = new Saxophone(bhn1, nd1);
                                System.out.println("--> SUKSES");break;
                            default:
                                System.out.println("Pilahan tidak tersedia");break;
                        }i += 1;break;
                    default:
                        System.out.println("Pilahan tidak tersedia");break;
                }
            }
        } while (jml != 0);
        System.out.println("===========================\nALAT MUSIK YANG DIPILIH : ");
        for (int j = 0; j < musik.length; j++) {
            System.out.println(musik[j] + "\n---------------------------");
        }System.out.println("===========================\n     155150207111081\n>> copyright © by Aditya <<\n===========================");
    }
}