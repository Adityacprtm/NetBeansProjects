package Bab2;

import java.util.*;

public class Search {
    // Global data

    public static int M; // deklarasi int m untuk ember 1
    public static int N; // deklarasi int n untuk ember 2
    public static int K; // deklarasi int k untuk hasil yang diinginkan
// membuat Main method

    public static void main(String[] args) {
        promptInput();
        displayOutput(search());
    }
    // membuat method state stack untuk Traverse, search, dan mengembalikan nilai jika

    public static Stack<State> search() {
        // Contains melebar atau expand
        Queue<State> Q = new LinkedList<State>();
        // Contains states yang sudah dikunjungi
        ArrayList<State> visited = new ArrayList<State>();
        Q.add(new State()); // dimulai dari state awal
        // selesai search ketika semua kemungkinan sudah expand
        while (!Q.isEmpty()) {
            // mengembalikan dan menghapus state pertama untuk checking dan expansion 
            State current = Q.remove();
            // mengembalikan stack yang berisi semua state yang sudah lewat if 
            //jika tujuan sudah ditemukan                   
            if (current.isGoal(K)) {
                Stack<State> solution = new Stack<State>();
                // melacak kembali goal state
                while (current != null) {
                    solution.push(current);
                    current = current.getParent();
                }
                return solution;
            }
            // menandai state yang sedang berlangsung dengan tanda terkunjungi
            visited.add(current);
            // Expand state yang sedang berlangsung
            applyActions(current);
            // menetapkan nilai terendah untuk perbandingan
            int lowestCost = 0;
            // menambahkan mereka ke antrian untuk expansi lebih lanjut
            for (State child : current.getChildren()) {
                // memperkirakan dan set nilai selanjutnya untuk children tingkatan yang sama 
                child.setFutureCost(heuristicEstimate(visited, child));
                // dipertimbangkan haya cost yang kurang dari cost yang ditetapkan
                if (child.getCost() <= lowestCost) {
                    Q.add(child);
                }
            }
        }
// mengembalikan null jika tidak ada solusi
        return null;
    }
    // method untuk output

    public static void promptInput() {
        @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);
        System.out.println("====================================================================");
        System.out.print("Please enter the capacity in gallonof your 1st bucket (M) : ");
        M = console.nextInt();
        System.out.print("Please enter the capacity in gallonof your 2nd bucket (N) : ");
        N = console.nextInt();
        System.out.print("Please enter the desired amount ofwater in gallon (K) : ");
        K = console.nextInt();
        System.out.println();
        System.out.println("====================================================================");
    }
// Display solusi jika

    public static void displayOutput(Stack<State> solution) {
        if (solution != null) {
            System.out.println("Here is the solution:\n");
            int steps = solution.size() - 1; // Count steps
            // mengembalikan dan menampilkan semua states yang sudah lewat dari state awal
            //ke state tujuan atau goal
            while (!solution.isEmpty()) {
                // Traverse set actions dan cai lokasi action that yang diterapkan pada state
                //yang sedang berlangsung
                for (Action action : solution.pop().getActions()) {
                    if (action.getChild() == solution.peek()) {
                        System.out.println(action.toString());
                    }
                }
            }
            System.out.println(String.format("\nTotal steps consumed: %d\n", steps));
            System.out.println("Note: This is the BEST solution!");
            // menampilkan tidak ada solusi jika tidak adasolusi
        } else {
            System.out.println("No Solution!");
        }
    }
    // menerapkan action ke state yang diberikan

    public static void applyActions(State current) {
// ember bisa disi bila tidak penuh
        if (current.getM() != M) {
            fillM(current);
// target belum full, sumber tidak boleh kosong untuk mengirim air
            if (current.getN() != 0) {
                fillMWithN(current);
            }
        }
// ember bisa diisi bila tidak penuh
        if (current.getN() != N) {
            fillN(current);
// target belum full, sumber tidak boleh kosong untuk mengirim air
            if (current.getM() != 0) {
                fillNWithM(current);
            }
        }
// ember bisa di kosongkan bila ember tidak kosong atau berisi
        if (current.getM() != 0) {
            emptyM(current);
        }
// ember bisa di kosongkan bila ember tidak kosong atau berisi
        if (current.getN() != 0) {
            emptyN(current);
        }
    }
    // Method berisi actions mengisi ember pertama yang berisi

    public static void fillM(State current) {
        State child = new State(M, current.getN()); //deklarasi child state
        child.setParent(current); // akses method setParen tisi current
        // menetapkan dan set cost yang lampau dari curren tstate jadi agak jauh dari parentnya
        child.setPastCost(current.getPastCost() + 1);
        current.addChild(child); // akses method addChild isi child
        // menambahkan action untuk set actions dari current state
        current.addAction(new Action(current, child,
                String.format("Fill the %d- gallon bucket", M)));
    }
    // Method berisi actions mengisi ember kedua yang berisi

    public static void fillN(State current) {
        State child = new State(current.getM(), N); //deklarasi child state
        child.setParent(current); // akses method set Parentisi current
        // menetapkan dan set cost yang lampau dari current state jadi agak jauh dari parentnya
        child.setPastCost(current.getPastCost() + 1);
        current.addChild(child); // akses metheod addChild isi child
        // menambahkan action untuk set actions dari current stat
        current.addAction(new Action(current, child,
                String.format("Fill the %d- gallon bucket", N)));
    }
// method untuk action mengosongkan ember pertama yang berisi

    public static void emptyM(State current) {
        State child = new State(0, current.getN()); // deklarasi child state
        child.setParent(current); // akses method setParent isi current
        // menetapkan dan set cost yang lampau dari current state jadi agak jauh dari parentnya
        child.setPastCost(current.getPastCost() + 1);
        current.addChild(child); // akses method addChild isi child isi child
        // menambahkan action untuk set actions dari current stat
        current.addAction(new Action(current, child, String.format("Empty the %d- gallon bucket", M)));
    }
    // method untuk action mengosongkan ember ke dua yang berisi

    public static void emptyN(State current) {
        State child = new State(current.getM(), 0); //deklarasi child state
        child.setParent(current); // akses method setParent isi current
        // menetapkan dan set cost yang lampau dari current state jadi agak jauh dari parentnya
        child.setPastCost(current.getPastCost() + 1);
        current.addChild(child); // akses method addChild isi child
        // menambahkan action untuk set actions dari current state
        current.addAction(new Action(current, child,
                String.format("Empty the %d- gallon bucket", N)));
    }

    // membuat method yang mengisi ember satu dengan ember dua yang berisikan
    public static void fillMWithN(State current) {
        State child; // deklarasi child state
        // situasi pengiriman air tidak ada tanda tanda akan kebocoran
        if (current.getM() + current.getN() <= M) {
            child = new State(current.getM() + current.getN(), 0);
        } else { // ini situasi kalau bocor
            child = new State(M, current.getN() - (M
                    - current.getM()));
        }
        child.setParent(current); // akses method setParent isi current
        // menetapkan dan set cost yang lampau dari current state jadi agak jauh dari parentnya
        child.setPastCost(current.getPastCost() + 1);
        current.addChild(child); // akses method addChild isi child
        // menambahkan action untuk set actions dari current state
        current.addAction(new Action(current, child, String.format("Fill the %d- gallon bucket with the water in the %d gallon bucket until full or the other is empty", M, N)));
    }
    // method yang mengisi ember kedua dari ember pertama yang berisikan
public static void fillNWithM(State current) {
        State child; // deklarasi child state
        // situasi pengiriman air tidak ada tanda tanda akan kebocoran
        if (current.getM() + current.getN() <= N) {
            child = new State(0, current.getM()
                    + current.getN());
        } else { // ini situasi kalau bocor
            child = new State(current.getM() - (N
                    - current.getN()), N);
        }
        child.setParent(current); // akses method setParent isi current
        // menetapkan dan set cost yang lampau dari current state jadi agak jauh dari parentnya
        child.setPastCost(current.getPastCost() + 1);
        current.addChild(child); // akses method addChild isi child
        // menambahkan action untuk set actions dari current state
        current.addAction(new Action(current, child, String.format("Fill the %d- gallon bucket with the water in the %d gallon bucket until full or the other is empty", N, M)));
    }
    // memperkirakan cost selanjutnya dari state yang sedang berlangsung atau
    //current state ke state yang dituju, berisikan
public static int heuristicEstimate(ArrayList<State> A, State S) {
        // Correct dan reset cost yang sudah di definisi
        if (S.belongsTo(A)) {
            return S.getFutureCost();
        }
        // atau, mendefinisikan cost current state jadi satulangkah mendekati
        //state tujuan daripada parentnya
        return S.getParent().getFutureCost() - 1;
    }
}
