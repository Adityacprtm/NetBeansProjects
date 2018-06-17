public class SingleMain {
    
    public static void main(String[] args) {
        SLLC data = new SLLC();
        System.out.println("\t\tSINGLE LINKED LIST CIRCULAR (SLLC)");
        System.out.println("============================= Data Awal =============================");
        data.addFirst(new SLLC(150));
        data.addFirst(new SLLC(175));
        data.addFirst(new SLLC(250));
        data.addFirst(new SLLC(300));
        data.cetak();
        System.out.println("\n====================== Data Setelah Modifikasi ======================");
        data.addLast(new SLLC(350));
        data.insertAfter(350, new SLLC(450));
        data.insertBefore(250, new SLLC(550));
//        data.removeFirst();
//        data.removeLast();
        data.remove(150);
        data.cetak();
        
    }
    
}
