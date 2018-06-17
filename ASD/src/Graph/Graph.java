package Graph;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Graph {
    private class Node {
        private int data;
        private Node next;
        private int distance;
        private boolean wasVisited;
        public int edgeIn, edgeOut;
        public Node(int dt, Node n, int d) {
            data = dt;
            next = n;
            distance = d;
            wasVisited = false;
        }
        private Node(int i, int MAX_VALUE) {
            distance = MAX_VALUE;
        }
        public int getDt() {
            return data;
        }
        public Node getNext() {
            return next;
        }
        public int getDistance() {
            return distance;
        }
    }
    private Node[] node;
    private int jNode;
    private int adjMat[][];
    private Stack theStack;
    private Queue theQueue;
    public Graph(int n) {
        jNode = n;
        node = new Node[jNode];
        for (int i = 0; i < jNode; i++) {
            node[i] = null;
        }
        adjMat = new int[jNode][jNode];
        for (int j = 0; j < jNode; j++) {
            for (int k = 0; k < jNode; k++) {
                adjMat[j][k] = 0;
            }
        }
        theStack = new Stack();
        theQueue = new LinkedList();
    }
    private Node[] adjacency(Node node) {
        Node[] adj = new Node[jNode];
        adj[0] = node;
        int i = 1;
        while (node != null) {
            adj[i] = node;
            node = node.next;
        }
        return adj;
    }
    public void adjMatrix() {
        System.out.println("Adjacency Matrix");
        for (int i = 0; i < jNode; i++) {
            for (int j = 0; j < jNode; j++) {
                System.out.print(adjMat[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    public void getAdjacency(int n) {
        Node[] adj = adjacency(this.node[n]);
        System.out.print("Tetangga dari " + n + " : ");
        for (int i = 0; adj[i] != null; i++) {
            System.out.print(adj[i].getDt() + " ");
        }
        System.out.println("");
    }
    public int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < jNode; j++) {
            if (node[j] != null && adjMat[v][j] != 0 && node[j].wasVisited == false) {
                return j;
            }
        }
        return -1;
    }
    public void bfs() {
        node[0].wasVisited = true;
        System.out.print("BFS : " + 0 + " ");
        theQueue.add(0);
        int v2;
        while (!theQueue.isEmpty()) {
            int v1 = (int) theQueue.remove();
            while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {
                node[v2].wasVisited = true;
                System.out.print(v2 + " ");
                theQueue.add(v2);
            }
        }
        for (int j = 0; j < jNode; j++) {
            if (node[j] != null) {
                node[j].wasVisited = false;
            }
        }
        System.out.println("");
    }
    public void dfs() {
        node[0].wasVisited = true;
        System.out.print("DFS : " + 0 + " ");
        theStack.push(0);
        while (!theStack.isEmpty()) {
            int v = getAdjUnvisitedVertex((int) theStack.peek());
            if (v == -1) {
                theStack.pop();
            } else {
                node[v].wasVisited = true;
                System.out.print(v + " ");
                theStack.push(v);
            }
        }
        for (int j = 0; j < jNode; j++) {
            if (node[j] != null) {
                node[j].wasVisited = false;
            }
        }
        System.out.println("");
    }
    public void addAdj(int head, int adj, int d) {
        Node n = new Node(adj, node[head], d);
        node[head] = n;
        adjMat[head][adj] = d;
    }
    public void getEdgeInOut(int n) {
        for (int i = 0; i < jNode; i++) {
            if (adjMat[n][i] != 0) {
                node[n].edgeOut++;
            }
            if (adjMat[i][n] != 0) {
                node[n].edgeIn++;
            }
        }
        System.out.println("Vertex " + n + " : Edge In = " + node[n].edgeIn + " Edge Out = " + node[n].edgeOut);
    }
    public void cetak() {
        for (int i = 0; i < jNode; i++) {
            System.out.print("[" + i + "]");
            Node n = node[i];
            while (n != null) {
                System.out.print("->" + n.getDt());
                n = n.getNext();
            }
            System.out.println();
        }
    }
    public void findShortest(int a, int b) {
        int[] dist = dijkstra(adjMat, a);
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                dist[i] = 0;
            }
        }
        System.out.println("Jarak minimal dari vertex " + a + " ke " + b + " : " + dist[b]);
    }
    int minDistance(int dist[], Boolean sptSet[]) {
        int min = Integer.MAX_VALUE, min_index = -1;
        for (int v = 0; v < jNode; v++) {
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
        }
        return min_index;
    }
    int[] dijkstra(int graph[][], int src) {
        int dist[] = new int[jNode];
        Boolean sptSet[] = new Boolean[jNode];
        for (int i = 0; i < jNode; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
        dist[src] = 0;
        for (int count = 0; count < jNode - 1; count++) {
            int u = minDistance(dist, sptSet);
            sptSet[u] = true;
            for (int v = 0; v < jNode; v++) {
                if (!sptSet[v] && graph[u][v] != 0
                        && dist[u] != Integer.MAX_VALUE
                        && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        return dist;
    }
    public static void main(String s[]) {
        Graph g = new Graph(5);
        g.addAdj(0, 3, 5);
        g.addAdj(0, 1, 6);
        g.addAdj(1, 4, 4);
        g.addAdj(1, 2, 11);
        g.addAdj(2, 4, 8);
        g.addAdj(2, 1, 5);
        g.addAdj(4, 3, 6);
        g.cetak();
        g.getAdjacency(2);
        g.bfs();
        g.dfs();
        g.adjMatrix();
        g.getEdgeInOut(4);
        g.findShortest(0, 2);
    }
}