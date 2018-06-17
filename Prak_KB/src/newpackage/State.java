package Bab2;

import java.util.*;
//deklarasi state jika di dua ember terdapat air

public class State {
// Data

    private int m; // deklarasi int x untuk ember pertama
    private int n; // deklarasi int y untuk ember kedua
    private int pastCost; // deklarasi int pastcost
    private int futureCost; // deklarasi int futurecost
    private State parent; // deklarasi state parent
    private ArrayList<State> children; // deklarasi arraylist children
    private ArrayList<Action> actions; // deklarasi arraylist actions
    public static int infinity = 99999; // deklarasi int infinity bernilai 99999
    // Constructor yang dibuat untuk default

    public State() {
        m = n = 0;
        parent = null;
        pastCost = 0;
        futureCost = infinity;
        actions = new ArrayList<Action>();
        children = new ArrayList<State>();
    }
    // Constructor untuk beberapa aksi yang berparameter ember1 dan 2

    public State(int m, int n) {
        this.m = m;
        this.n = n;
        parent = null;
        pastCost = infinity;
        futureCost = infinity;
        actions = new ArrayList<Action>();
        children = new ArrayList<State>();
    }
    // Set banyaknya air pada ember pertama

    public void setM(int m) {
        this.m = m;
    }
    // Set banyaknya air pada ember kedua

    public void setN(int n) {
        this.n = n;
    }
    // Set cost pada state awal

    public void setPastCost(int pastCost) {
        this.pastCost = pastCost;
    }
    // Set perkiraan cost ke state tujuan

    public void setFutureCost(int futureCost) {
        this.futureCost = futureCost;
    }
    // Set parent state

    public void setParent(State parent) {
        this.parent = parent;
    }
    // tambah child ke set children

    public void addChild(State child) {
        children.add(child);
    }
    // tambah action

    public void addAction(Action action) {
        actions.add(action);
    }
    // mengembalikan nilai banyak air pada ember pertama

    public int getM() {
        return m;
    }
    // mengembalikan nilai banyak air pada ember kedua

    public int getN() {
        return n;
    }
    // mengembalikan nilai parent state

    public State getParent() {
        return parent;
    }
    // mengembalikan nilai pastcost

    public int getPastCost() {
        return pastCost;
    }
    // mengembalikan nilai future cost

    public int getFutureCost() {
        return futureCost;
    }
    // menghitung dan mengembalikan nilai totalcost

    public int getCost() {
        return pastCost + futureCost - infinity;
    }
    // mengembalikan nilai set children

    public ArrayList<State> getChildren() {
        return children;
    }
    // mengembalikan action

    public ArrayList<Action> getActions() {
        return actions;
    }
    // check jika current state sudah state tujuan

    public boolean isGoal(int k) {
        return m == k || n == k || m + n == k;
    }
    // check jika 2 state sama

    public boolean isEqual(State state) {
        return m == state.getM() && n == state.getN();
    }
    // Check jika urutan mengandung current state, yang berisikan

    public boolean belongsTo(ArrayList<State> A) {
    // Traverse urutan
        for (State S : A) {
        // Return true jika kesamaan ditemukan
            if (m == S.getM() && n == S.getN()) {
                return true;
            }
        }
    // False jika sebaliknya
        return false;
    }
    // RMembuat format bertipe String pada output yang berisikan air saat ini dikedua ember

    public String toString() {
        return String.format("(%d,%d)", m, n);
    }
}
