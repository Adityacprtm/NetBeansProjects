package uapsem2;

public class MainSalon {

    public static void main(String[] args) {
        Salon[] pelanggan = new Salon[5];
        pelanggan[0] = new Ruby("Siti", "Creambath", 50000, "Shampo", 20000);
        pelanggan[1] = new Premium("Juminten", "Potong rambut", 45000, "Gunting", 10000);
        pelanggan[2] = new Gold("Raisa", "Perawatan", 200000, "-", 0);
        pelanggan[3] = new Silver("Audy", "Potong kuku", 30000, "pemotong", 7500);
        pelanggan[4] = new NonMember("Joko", "Cukur", 15000, "Sabun", 5000);
        for (Salon semuaPelanggan : pelanggan) {
            System.out.println(semuaPelanggan + "\n");
        }
    }
}
