package PrakKB3;

public class Graph {

    private int[][] dt1;
    private int current = 0;

    private class Node {

        private int data, jarak;
        private Node next;

        public Node(int dt, Node n, int jrk) {
            data = dt;
            next = n;
            jarak = jrk;
        }

        public int getDt() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public int getJarak() {
            return jarak;
        }
    }

    private Node[] node;
    private int jNode;

    public Graph(int n) {
        jNode = n;
        node = new Node[jNode];
        for (int i = 0; i < jNode; i++) {
            node[i] = null;
        }
        dt1 = new int[n][n];
    }

    public void addAdj(int head, int adj, int jarak) {
        Node n = new Node(adj, node[head], jarak);
        node[head] = n;
        current++;
        dt1[head][adj]++;
    }

    public int[] arraylong(int[] d, int z) {
        int[] total = new int[d.length + 1];
        for (int i = 0; i < d.length; i++) {
            total[i] = d[i];
        }
        total[d.length] = z;
        return total;
    }

    public char ubah(int a) {
        switch (a) {
            case 0:
                return 'A';
            case 1:
                return 'B';
            case 2:
                return 'C';
            case 3:
                return 'D';
            case 4:
                return 'E';
            case 5:
                return 'F';
            case 6:
                return 'G';
            default:
                return 'S';
        }
    }

    public int[] getNode(int asal) {
        int[] jwb = new int[0];
        Node n = node[asal];
        while (n != null) {
            System.out.println("->" + ubah(n.getDt()) + " " + n.getJarak());
            jwb = arraylong(jwb, n.getDt());
            jwb = arraylong(jwb, n.getJarak());
            n = n.getNext();
        }
        return jwb;
    }
}
