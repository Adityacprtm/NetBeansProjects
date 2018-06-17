
public class Contoh {

    void hitungLuas(int a, int b) {
        System.out.println("Luas = " + (a * b));
    }

    int hitungKeliling(int a, int b) {
        return (2 * (a + b));
    }

    public static void main(String[] args) {
        Contoh persegiPnjng = new Contoh();
        persegiPnjng.hitungLuas(5, 9);
        System.out.println("Keliling = " + persegiPnjng.hitungKeliling(5, 9));
    }
}
