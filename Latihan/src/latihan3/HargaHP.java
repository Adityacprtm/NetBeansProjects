package latihan3;
import java.util.Scanner;
public class HargaHP {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long hss = 3000000;
        long hxi = 2000000;
        long hlg = 1500000;
        long hso = 1000000;
        System.out.print("Merk = ");
        String merk = in.next();
        System.out.print("jumlah = ");
        int jml = in.nextInt();
        
        switch (merk){
            case "samsung":
                if (jml >2){
                    System.out.println("harga diskon = "+((hss*jml)-(hss*jml*(20/100))));
                }else {
                    System.out.println("harga = "+(hss*jml));
                }break;
            case "xiaomi":
                if (jml >2){
                    System.out.println("harga diskon = "+((hxi*jml)-(hxi*jml*(15/100))));
                }else {
                    System.out.println("harga = "+(hxi*jml));
                }break;
            case "lg":
                if (jml >2){
                    System.out.println("harga diskon = "+((hlg*jml)-(hlg*jml*(15/100))));
                }else {
                    System.out.println("harga = "+(hlg*jml));
                }break;
            case "sony":
                if (jml >2){
                    System.out.println("harga diskon = "+((hso*jml)-(hso*jml*(15/100))));
                }else {
                    System.out.println("harga = "+(hso*jml));
                }break;
        }
    }
}
