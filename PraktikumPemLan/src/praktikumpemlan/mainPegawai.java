package praktikumpemlan;

public class mainPegawai {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("\t\t Pegawai 1");
        System.out.println("=========================================");
        pegawai p1 = new pegawai("Isradi", "18", 5000, false, 2016);
        p1.info();
        System.out.println("---------------------------------");
        p1.tambahgaji();
        p1.info();
        System.out.println("---------------------------------");
        p1.tambahgaji();
        p1.setPasangan(true);
        p1.info();
        System.out.println("---------------------------------");
        System.out.println("=========================================");
        System.out.println("\t\t Pegawai 2");
        System.out.println("=========================================");
        pegawai p2 = new pegawai("Azhar", "20", 7500, false, 2007);
        p2.info();
        System.out.println("---------------------------------");
        p2.tambahgaji();
        p2.info();
        System.out.println("---------------------------------");
        p2.tambahgaji();
        p2.setPasangan(true);
        p2.info();
        System.out.println("---------------------------------");
        System.out.println("=========================================");
        System.out.println("\t\t Manager");
        System.out.println("=========================================");
        Manager Hafis = new Manager("Hafis", "14", 10000, false, 2009);
        Hafis.info();
        System.out.println("---------------------------------");
        Hafis.tambahgaji();
        Hafis.info();
        System.out.println("---------------------------------");
        Hafis.tambahgaji();
        Hafis.setPasangan(true);
        Hafis.info();
        System.out.println("---------------------------------");
        System.out.println("=========================================");
        System.out.println("\t\t Programmer");
        System.out.println("=========================================");
        Programmer adit = new Programmer("Adit", "09", 10000, true, 2005, 10);
        adit.info();
        System.out.println("---------------------------------");
        adit.tambahGaji();
        adit.info();
        System.out.println("---------------------------------");
        System.out.println("=========================================");
        System.out.println("\t\t Boss");
        System.out.println("=========================================");
        Boss Gubak = new Boss("Gubak", "17", 10000, false, 2009, 5);
        Gubak.info();
        System.out.println("---------------------------------");
        Gubak.tambahgaji();
        Gubak.info();
        System.out.println("---------------------------------");
        Gubak.tambahgaji();
        Gubak.info();
        System.out.println("---------------------------------");
        System.out.println("=========================================");
        System.out.println("\t\t Office Boy");
        System.out.println("=========================================");
        OB Hajir = new OB("Hajir", "22", 10000, false, 2006, 3);
        Hajir.info();
        System.out.println("---------------------------------");
        Hajir.tambahgaji();
        Hajir.info();
        System.out.println("---------------------------------");
        Hajir.tambahgaji();
        Hajir.setPasangan(true);
        Hajir.info();
        System.out.println("---------------------------------");
    }

}
