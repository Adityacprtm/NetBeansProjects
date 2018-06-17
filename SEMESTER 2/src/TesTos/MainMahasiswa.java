package TesTos;

public class MainMahasiswa {

    public static void main(String[] args) {
        
//objek mahasiswa 1
        Mahasiswa m1 = new Mahasiswa();
        m1.setNama("Aditya");
        m1.setNim("155150207111081");
        m1.setFakultas("Informatika");
        m1.setAngkatan("155150207111081");
        m1.setIpk("4");
        m1.displayMessage();
        System.out.println("----------------------------------");
        
//objek mahasiswa 2
        Mahasiswa m2 = new Mahasiswa();
        m2.setNama("Aditya");
        m2.setNim("145150207111081");
        m2.setFakultas("Informatika");
        m2.setAngkatan("145150207111081");
        m2.setIpk("3");
        m2.displayMessage();
        System.out.println("----------------------------------");
        
//objek mahasiswa 3
        Mahasiswa m3 = new Mahasiswa();
        m3.setNama("Aditya");
        m3.setNim("135150207111081");
        m3.setFakultas("Informatika");
        m3.setAngkatan("135150207111081");
        m3.setIpk("2");
        m3.displayMessage();
        System.out.println("----------------------------------");
    }
}
