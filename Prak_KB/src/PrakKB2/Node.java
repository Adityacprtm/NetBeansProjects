package PrakKB2;

import java.util.ArrayList;

public class Node {

    public String stateName;
    int firstBucket, secondBucket;
    public Node leftChild;
    public Node rightChild;
    public Node middleChild;
    public Node middleChild2;
    public int firstMax, secondMax, goal;

    public Node() {

    }

    public void setNode(int firstMax, int secondMax, int goal) {
        this.firstMax = firstMax;
        this.secondMax = secondMax;
        this.goal = goal;
    }

    public Node(int first, int second) {
        this.stateName = Integer.toString(first) + "," + Integer.toString(second);
        firstBucket = first;
        secondBucket = second;
    }

    public void setChildren() {
        if (firstBucket == 0) {
            leftChild = new Node(firstMax, secondBucket);
            leftChild.setNode(firstMax, secondMax, goal);
        }
        if (firstBucket > 0 && secondBucket != secondMax) {
            boolean finish = false;
            int one, two;
            one = firstBucket;
            two = secondBucket;
            while (finish == false) {
                one--;
                two++;
                if (one == 0 || two == secondMax) {
                    leftChild = new Node(one, two);
                    leftChild.setNode(firstMax, secondMax, goal);
                    finish = true;
                }
            }
        }
        if (secondBucket == 0) {
            rightChild = new Node(firstBucket, secondMax);
            rightChild.setNode(firstMax, secondMax, goal);
        }
        if (secondBucket > 0 && firstBucket != firstMax) {
            boolean finish = false;
            int one, two;
            one = firstBucket;
            two = secondBucket;
            while (finish == false) {
                one++;
                two--;
                if (one == firstMax || two == 0) {
                    rightChild = new Node(one, two);
                    rightChild.setNode(firstMax, secondMax, goal);
                    finish = true;
                }
            }
        }
        if (firstBucket > 0) {
            middleChild = new Node(firstBucket, 0);
            middleChild.setNode(firstMax, secondMax, goal);
        }

        if (secondBucket > 0) {
            middleChild2 = new Node(0, secondBucket);
            middleChild2.setNode(firstMax, secondMax, goal);
        }

    }

    public ArrayList<Node> getChildren() {
        ArrayList<Node> childNodes = new ArrayList<>();
        if (this.leftChild != null) {
            childNodes.add(leftChild);
        }
        if (this.rightChild != null) {
            childNodes.add(rightChild);
        }
        if (this.middleChild != null) {
            childNodes.add(middleChild);
        }
        if (this.middleChild2 != null) {
            childNodes.add(middleChild2);
        }
        return childNodes;
    }

    public boolean removeChild(Node n) {
        return false;
    }

}

/*
    Method setNode berfungsi sebagai inisialisasi nilai m, n, k atau ember1, ember2, dan goal.

    Method setChildren akan menentukan sendiri ekspansi atau percabangan dari sebuah state tertentu yang akan menjadi sebuah node anak
    dari node tersebut

*/
