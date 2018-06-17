
public class AppStackObject {

    public static void main(String[] args) {
        //implementasi Stack
        StackObject st = new StackObject(3);
        st.push(new Double(5));
        st.push(new Double(8));
        st.push(new Double(7));
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
        StackObject stBuku = new StackObject(3);
        stBuku.push(new Buku("Java", "Anton"));
        stBuku.push(new Buku("Algoritma dan STD", "Achmad"));
        stBuku.push(new Buku("C++", "Budi"));
        while (!stBuku.isEmpty()) {
            System.out.println(stBuku.pop());
        }
    }
}
