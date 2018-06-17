package Modul2Bab4;
public class BukuAlamatMain {
    public static void main(String[] args) {
        BukuAlamat[] data = new BukuAlamat[4];
        //set nilai atribut di mutator
        data[0] = new BukuAlamat();
        data[0].setNama("Aditya Chamim Pratama");
        data[0].setAlamat("jl.cengkeh Malang");
        data[0].setNoTelp("+6287814056616");
        data[0].setEmail("pratamaditya7@gmail.com");
        data[1] = new BukuAlamat();
        data[1].setNama("Eliza Karmila Santi");
        data[1].setAlamat("jl.Surya Banjarbaru");
        data[1].setNoTelp("+6289691613374");
        data[1].setEmail("eliza.karmila@gmail.com");
        //set nilai atribut di constructor
        data[2] = new BukuAlamat("Widya Maulidina", "jl.Mustika Martapura", "+6281250516059", "widyamaulidina@gmail.com");
        data[3] = new BukuAlamat("Jessila Tri Almira", "jl.Mawar Banjarmasin", "+6285654200686", "jessilatrialmira@yahoo.co.id");
        //tampilan
        System.out.println("===============================================================================================");
        System.out.println("                                    B U K U   A L A M A T");
        System.out.println("===============================================================================================");
        System.out.printf("%-3s%-23s%-23s%-17s%s\n", "No", "Nama", "Alamat", "No Telepon", "Email");
        System.out.println("-----------------------------------------------------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-3d%-23s%-23s%-17s%s\n", (i + 1), data[i].getNama(), data[i].getAlamat(), data[i].getNoTelp(), data[i].getEmail());
        }
        System.out.println("===============================================================================================");
        System.out.println("                                       155150207111081");
        System.out.println("                             >> copyright© by Aditya Chamim Pratama <<");
        System.out.println("===============================================================================================");
    }
}