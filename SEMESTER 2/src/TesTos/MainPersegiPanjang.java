package TesTos;

public class MainPersegiPanjang {

    public static void main(String[] args) {

        PersegiPanjang kkecil = new PersegiPanjang();
        PersegiPanjang kbesar = new PersegiPanjang();

        //kotak kecil
        kkecil.panjang = 10;
        kkecil.lebar = 4;
        System.out.println("Luasnya : " + kkecil.hitungLuas());
        System.out.println("Kel : "+kkecil.hitungKel());

        //kotak besar
        kbesar.panjang = 20;
        kbesar.lebar = 5;
        System.out.println("Luasnya : " + kbesar.hitungLuas());
        System.out.println("Kel : "+kbesar.hitungKel());
    }
}
