public class Queue {
    private List listAntrian;
    public Queue() {
        listAntrian = new List("queue");
    }
    public void enqueue(Object object) {
        listAntrian.sisipDiAkhir(object);
    }
    public Object dequeue() {
        return listAntrian.hapusDrDepan();
    }
    public boolean kosong() {
        return listAntrian.kosong();
    }
    public void cetak() {
        listAntrian.cetak();
    }
    public static void main(String args[]) {
        System.out.println("====== QUEUE C S L L ======");
        Queue q = new Queue();
        q.enqueue(10);
        q.cetak();
        q.enqueue(40);
        q.cetak();
        q.enqueue(25);
        q.cetak();
        q.enqueue(30);
        q.cetak();
        Object dtHapus = null;
        while (!q.kosong()) {
            dtHapus = q.dequeue();
            System.out.printf("%s dihapus \n", dtHapus);
            q.cetak();
        }
        System.out.println("\n===== QUEUE ROUND ROBIN =====");
        Queue qrr = new Queue();
        qrr.enqueue(4);
        qrr.cetak();
        qrr.enqueue(2);
        qrr.cetak();
        qrr.enqueue(3);
        qrr.cetak();
        Object dtHapusQrr = null;
        while (!qrr.kosong()) {
            dtHapusQrr = qrr.dequeue();
            if ((int) dtHapusQrr - 1 != 0) {
                qrr.enqueue((int) dtHapusQrr - 1);
            }
            System.out.printf("%s dequeue \n", dtHapusQrr);
            qrr.cetak();
        }
    }
}