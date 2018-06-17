package BinaryTree;
import java.util.Random;
public class Tree {
    private Node root;
    private int banyakNode;
    private static int cBT[] = new int[10];
    public Tree() {
        root = null;
    }
    public void sisipDtNode(int dtSisip) {
        banyakNode++;
        if (root == null) {
            root = new Node(dtSisip);
        } else {
            root.sisipDt(dtSisip);
        }
    }
    public void preorderTraversal() {
        preorder(root);
    }
    private void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.printf("%d ", node.data);
        preorder(node.nodeKiri);
        preorder(node.nodeKanan);
    }
    public void inorderTraversal() {
        inorder(root);
    }
    private void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.nodeKiri);
        System.out.printf("%d ", node.data);
        inorder(node.nodeKanan);
    }
    public void postorderTraversal() {
        postorder(root);
    }
    private void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.nodeKiri);
        postorder(node.nodeKanan);
        System.out.printf("%d ", node.data);
    }
    public int getBanyakNode() {
        return banyakNode;
    }
    public int getBanyakDaun() {
        return banyakDaun(root);
    }
    public int banyakDaun(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.nodeKiri == null && root.nodeKanan == null) {
            return 1;
        } else {
            return banyakDaun(root.nodeKiri) + banyakDaun(root.nodeKanan);
        }
    }
    public int getTinggiPohon() {
        return tinggiPohon(root);
    }
    public static int tinggiPohon(Node root) {
        if (root == null) {
            return 0;
        }
        return (1 + Math.max(tinggiPohon(root.nodeKiri), tinggiPohon(root.nodeKanan)));
    }
    public static int levelPohon(Tree tree) {
        if (tree == null) {
            return 0;
        }
        return tinggiPohon(tree.root);
    }
    public void completeBinaryTree(int index) {
        if (index >= cBT.length) {
            return;
        }
        System.out.printf("%d ", cBT[index]);
        completeBinaryTree((2 * index) + 1);
        completeBinaryTree((2 * index) + 2);
    }
    public static void main(String args[]) {
        Tree Tree = new Tree();
        int nilai;
        Random randomNumber = new Random();
        System.out.println("sisip nilai data berikut : ");
        for (int i = 0; i < 10; i++) {
            nilai = randomNumber.nextInt(100);
            System.out.print(nilai + " ");
            cBT[i] = nilai;
            Tree.sisipDtNode(nilai);
        }
        System.out.println("\n\nPreorder traversal");
        Tree.preorderTraversal();
        System.out.println("\n\nInorder traversal");
        Tree.inorderTraversal();
        System.out.println("\n\nPostorder traversal");
        Tree.postorderTraversal();
        System.out.println();
        System.out.println();
        System.out.println("Banyak Node : " + Tree.getBanyakNode());
        System.out.println("Banyak Daun : " + Tree.getBanyakDaun());
        System.out.println("Tinggi Pohon : " + Tree.getTinggiPohon());
        System.out.println("Level Pohon : " + levelPohon(Tree) + "\n");
        System.out.println("Complete Binary Tree Array");
        Tree.completeBinaryTree(0);
        System.out.println("");
    }
}