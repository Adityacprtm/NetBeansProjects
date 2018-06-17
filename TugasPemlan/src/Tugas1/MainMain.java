package Tugas1;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MainMain {

    public static void main(String[] args) throws IOException {
//        java.io.File file = new java.io.File("12345.txt");
//        if (file.exists()) {
//            System.out.println("File already exists");
//            System.exit(1);
//        }

// Create a file
        Mahasiswa m1 = new Mahasiswa("Muhammad Ryandrie", "155150200111131", "Ilmu Komputer", "Informatika");
        m1.setPasswordLogin("brawijaya");

        UserLogin user1 = new UserLogin(m1, "brawijaya");
        user1.login();

        Address addr1 = new Address("Jl. Kenangan", "No. 37", "Malang", "Jawa Timur", "35445");
        m1.getAddr(addr1);
        System.out.println(m1.addr.street);
        m1.getAddr();
        m1.saveToFile("Kamukamu.txt");

        // Close the file
    }
}
