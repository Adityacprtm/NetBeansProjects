package TesTos;

public class MainAlamatPerson {

    public static void main(String[] args) {

        Alamat r1 = new Alamat();
        r1.jalan = "Jl.Soekarno-Hatta";
        r1.kpos = "1234";
        r1.norumah = "A1";

        Alamat r2 = new Alamat();
        r2.jalan = "Jl.Cengkeh";
        r2.kpos = "9876";
        r2.norumah = "80";

        Person orang1 = new Person();
        orang1.nama = "uyeeee";
        orang1.address = r1;

        Person orang2 = new Person();
        orang2.nama = "hahaha";
        orang2.address = r2;

        System.out.println("Nama : " + orang1.nama);
        System.out.println("Alamat1 : " + orang1.address.jalan + " " + "No." + orang1.address.norumah + " " + "Kode." + orang1.address.kpos);
        System.out.println("Nama : " + orang2.nama);
        System.out.println("Alamat2 : " + orang2.address.jalan + " " + "No." + orang2.address.norumah + " " + "Kode." + orang2.address.kpos);
    }
}
