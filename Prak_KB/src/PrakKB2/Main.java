package PrakKB2;

public class Main {

    public static void main(String[] args) {
        Node station1 = new Node(0, 0);
        //input m, n, k
        station1.setNode(5, 7, 1);
        station1.setChildren();
        IterativeDeepeningSearch bfs = new IterativeDeepeningSearch(station1);
        bfs.iterativeDeepeningDepthFirstSearch(station1);
    }
}

/*
    Method main berfungsi sebagai contoh kasus pada dua buah ember dengan menginputkan m, n, k pada setNode
 */
