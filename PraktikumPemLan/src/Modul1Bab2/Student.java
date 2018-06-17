package Modul1Bab2;

import java.util.*;

public class Student {

    Scanner input = new Scanner(System.in);
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int jumlahObjek = 0;

    public Student() {
        jumlahObjek += 1;
        name = "";
        address = "";
        age = 0;
    }

    public Student(String n, String a, int ag) {
        jumlahObjek += 1;
        name = n;
        address = a;
        age = ag;
    }

    public Student(int mathGrade, int englishGrade, int scienceGrade) {
        jumlahObjek += 1;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(int math) {
        mathGrade = math;
    }

    public void setEnglish(int english) {
        englishGrade = english;
    }

    public void setScience(int science) {
        scienceGrade = science;
    }

    private double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }

    public boolean statusAkhir(double rataRata) {
        System.out.println("Nilai rata-rata anda : " + rataRata);
        if (rataRata > 60) {
            return true;
        } else {
            return false;
        }
    }

    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beramalat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata rata " + getAverage());
        boolean a = statusAkhir(getAverage());
        if (a == true) {
            System.out.println("status Lolos");
        } else {
            System.out.println("status Remidi");
        }
    }

    public void jumlahObyek() {
        System.out.println("Jumlah objek : " + (this.jumlahObjek - 1));
    }
}
