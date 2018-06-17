public class Node2PCMain {
    public static void main(String[] args) {
        DLLC daftar = new DLLC();
        System.out.println("\tDOUBLE LINKED LIST CIRCULAR (DLCC)");
        System.out.println("=================================== Data Awal ===================================");
        daftar.addFirst(new DLLC(450));
        daftar.addFirst(new DLLC(350));
        daftar.addFirst(new DLLC(250));
        daftar.addFirst(new DLLC(150));
        daftar.cetak();
        System.out.println("\n============================ Data Setelah Modifikasi ============================");
        daftar.addFirst(new DLLC(100));
        daftar.addLast(new DLLC(550));
        daftar.insertAfter(250, new DLLC(225));
        daftar.insertBefore(250, new DLLC(200));
        daftar.removeFirst();
        daftar.removeLast();
        daftar.remove(250);
        daftar.cetak();
    }
}