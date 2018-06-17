package praktikumpemlan;

public class MainSalon {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("\t DAFTAR PENGUNJUNG SALON");
        System.out.println("=========================================");
        System.out.println("");
        Premium p = new Premium("Nunu", "Premium", 1000000, 400000, "Creambath dan\n\t\t\t\t Hair Tonic");
        p.display();
        p.setProduct(400000);
        p.totalPerawatan();
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");
        Gold g = new Gold("Ala", "Premium", 1000000, 300000, "Creambath");
        g.setAnggota("Gold");
        g.setBiaya(750000);
        g.setProduct(300000);
        g.display();
        g.totalPerawatan();
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");
        Silver s = new Silver("faiza", "Premium", 1000000, 200000, "Hair Tonic");
        s.setAnggota("Silver");
        s.setBiaya(500000);
        s.setProduct(200000);
        s.display();
        s.totalPerawatan();
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");
        nonMember n = new nonMember("irin", "Premium", 1000000, 100000);
        n.setAnggota("Non-member");
        n.setBiaya(250000);
        n.setProduct(100000);
        n.display();
        n.totalPerawatan();
    }
}
