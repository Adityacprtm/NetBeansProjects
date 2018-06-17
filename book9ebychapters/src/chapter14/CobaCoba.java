package chapter14;

public class CobaCoba {

    public static void main(String[] args) {
        int i;
        int sum = 0;
        for (i = 0; i < 10; i++) {
            sum += i;
        }
        assert i == 10;
        assert sum > 10 && sum < 5 * 10 : "sum is " + sum;
    }
}

//public class CobaCoba {
//
//    private String x;
//    private String y;
//
//    static void tampil(String x) throws Exception {
//        System.out.println("tampilkan " + x);
//        System.out.println("==============");
//        if (x.equals(x)) {
//            throw new Exception(x);
//        }
//    }
//
//    static void keluarkan(String y) throws Exception {
//        System.out.println("keluarkan " + y);
//        System.out.println("==============");
//        if (y.equals(y)) {
//            throw new RuntimeException(y);
//        }
//    }
//
//    public static void main(String[] args) {
//        try {
////keluarkan
//            keluarkan("Duit");
//            System.out.println("boke");
//            keluarkan("lagi kere");
////tampilkan
//            tampil("bagong ");
//            System.out.println("haloo");
//            tampil("lagi apa ");
//        } catch (Exception e) {
//            System.out.println("Terjadi Exception");
////e.getMessage()
////Mengembalikan nilai string yang
////berisi pesan rinci tentang objek
////Throwable yang mengalamiexception
//            System.out.println(e.getMessage());
////toString()
////Mengembalikan nilai string yang
////berisi pesan singkat tentang
////objek yang mengalami exception
//            System.out.println(e.toString());
//        } finally {
//            System.out.println("ini akan tercetak selalu");
//        }
//    }
//}
