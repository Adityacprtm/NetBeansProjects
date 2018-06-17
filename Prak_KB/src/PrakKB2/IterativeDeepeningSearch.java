package PrakKB2;

import java.util.ArrayList;
import java.util.Stack;

public class IterativeDeepeningSearch {

    Node startNode;
    Node goalNode;
    boolean goalFound = false;
    int depth = 0;
    int limit = 14;
    ArrayList<Node> visitedNodes;
    boolean truePath = true;

    public IterativeDeepeningSearch(Node start) {
        this.startNode = start;
        this.goalNode = goalNode;
    }

    public void iterativeDeepeningDepthFirstSearch(Node start) {
        Node input = start;
        for (int maxDepth = 1; goalFound == false; maxDepth++) {
            start.setChildren();
            if (goalFound) {
                break;
            }
            visitedNodes = new ArrayList<>();
            System.out.println("");
            System.out.println("Explored Node at depth : " + maxDepth);
            this.depth = maxDepth;
            depthFirstSearch(start, maxDepth);

        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Input : m = " + input.firstMax + "; n = " + input.secondMax + "; k = " + input.goal);
        System.out.println("Solution : ");
        visitedNodes.stream().forEach((item) -> {
            System.out.println(item.stateName + " ");
        });
        System.out.println("Jumlah Operasi : " + (visitedNodes.size() - 1));
    }

    public void depthFirstSearch(Node start, int maxDepth) {
        start.setChildren();
        truePath = true;
        if (goalFound) {
            return;
        }
        System.out.println(start.stateName + " => depth : " + Math.abs(maxDepth - this.depth));
        if (start.firstBucket == start.goal || start.secondBucket == start.goal) {
            goalFound = true;
            visitedNodes.add(start);
            System.out.println("Goal node found!");
            return;
        }
        visitedNodes.add(start);
        // If reached the maximum depth, stop recursing.
        if (maxDepth <= 0) {
            truePath = false;
            return;
        }
        // Recurse for all children of node.
        for (int i = 0, c = start.getChildren().size(); i < c; i++) {
            depthFirstSearch(start.getChildren().get(i), maxDepth - 1);
            if (truePath == false) {
                visitedNodes.remove(visitedNodes.size() - 1);
            }
        }
    }
}

/*
    Method iterativeDeepeningDepthFirstSearch melakukan pencarian DFS secara iterative pada limit tertentu yang terus bertambah
    hingga goal yang dituju dapat ditemukan. Method ini juga menampilkan hasil solusi dari node mana yang ditelusuri sampai goal ditemukan. 

    Method depthFirstSearch melakukan DFS sesuai dengan limit yang ditentukan. Pada method ini juga menampilkan node - node yang diexpand pada
    masing - masing level. Method ini akan merekursif dirinya sendiri sampai node terdalam (leaf) hingga goal tercapai.

*/
