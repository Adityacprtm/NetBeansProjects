package Bab2;

public class Action {

// Data field
    private State child; // Deklarasi state child
    private State parent; // Deklarasi state parent
    private String action; // Deklarasi actin bertipe String
// Constructor default

    public Action() {
        action = null;
        child = parent = null;
    }
// Constructor ke dua yang lebih spesifik ke actionya

    public Action(State parent, State child, String action) {
        this.child = child;
        this.parent = parent;
        this.action = action;
    }
// Set parent state

    public void setParent(State parent) {
        this.parent = parent;
    }
// Set child state

    public void setChild(State child) {
        this.child = child;
    }
// Set action

    public void setAction(String action) {
        this.action = action;
    }
// Mengembalikan nilai parent

    public State getParent() {
        return parent;
    }
// Mengembalikan nilai child

    public State getChild() {
        return child;
    }
// Mengembalikan nilai action

    public String getAction() {
        return action;
    }
    // Membuat format bertipe String pada output

    public String toString() {
        return String.format("%s\t--> %s\t%s",
                parent.toString(), child.toString(), action);
    }
}
