package Tugas1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Mahasiswa {

    Address addr;
    private String department;
    private int enteredYear;
    private String faculty;
    private String id;
    private String name;
    String nim;
    private String file;
    private String filename;
    public String address;
    public String passwordLogin;

    public Mahasiswa() {

    }

    public Mahasiswa(String name, String nim, String faculty, String deparment) {
        this.name = name;
        this.nim = nim;
        this.faculty = faculty;
        this.department = deparment;
    }

    public void setPasswordLogin(String s) {
        passwordLogin = s;
    }

    public void getAddr(Address A) {
        addr.street = A.street;
        addr.streetNumber = A.streetNumber;
        addr.city = A.city;
        addr.province = A.province;
        addr.poBox = A.poBox;
    }

    public void getAddr() {
        this.address = (addr.street + " " + addr.streetNumber);
    }

    public void resetData() {
        this.id = null;
        this.name = null;
        this.nim = null;
        this.faculty = null;
        this.department = null;
        this.enteredYear = 0;
        this.addr = null;
    }

    public void setDepartment(String s) {
        this.department = s;
    }

    public void setEnteredYear(int s) {
        this.enteredYear = s;
    }

    public void setFaculty(String s) {
        this.faculty = s;
    }

    public void setID(String s) {
        this.id = s;
    }

    public void setName(String s) {
        this.name = s;
    }

    public void setNIM(String s) {
        this.nim = s;
    }

    /**
     *
     * @param s
     */
    public int loadFromFile(String s) {
        java.io.File file = new java.io.File(s);
        filename = s;
        return 0;
    }

    /**
     *
     * @param s
     */
    public String saveToFile(String s) throws FileNotFoundException {

        this.file = (id + "#" + name + "#" + nim + "#" + enteredYear + "#" + address + "#" + faculty + "#" + department);
        java.io.File file = new java.io.File(s);
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        output.print(this.file);
        output.close();
        return this.file;
    }

    public String ToString() throws FileNotFoundException {
        String a = null;
        File s = new File(filename);
        Scanner input = new Scanner(s);
        while (input.hasNext()) {
            a = input.nextLine();
        }
//        System.out.println(a);
        input.close();
        return a;
    }

    public void loadFromString() throws FileNotFoundException {
        String a = ToString();
        String xxx[] = new String[9];
        xxx = a.split("#");
        for (int i = 0; i < xxx.length; i++) {
            System.out.println(xxx[i]);
        }

    }
}
