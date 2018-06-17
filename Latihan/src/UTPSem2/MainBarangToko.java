package UTPSem2;

public class MainBarangToko {

    public static void main(String[] args) {
        BarangToko[] barang = new BarangToko[2];
        
        barang[0] = new BarangToko("citato", "5000", "001-27-2015",10);
        barang[0].setNamaProdusen("indofood");
        barang[0].setTempatProduksi("malang");
        barang[0].jualBarang(7);

        barang[1] = new BarangToko("radio", "10000", "002-96-2016",5);
        barang[1].setNamaProdusen("maspion");
        barang[1].setTempatProduksi("jakarta");
        barang[1].tambahBarang(3);

        System.out.printf("%-4s%-15s%-13s%-10s%-10s%s\n","no","kode","nama","harga","stok","keterangan");
        for (int i = 0; i < barang.length; i++) {
            System.out.printf("%-4d%-15s%-13s%-10s%-10s%s\n",i+1,barang[i].getKodeBarang(),barang[i].getNamaBarang(),
                    barang[i].getHargaBarang(),barang[i].getStokBarang(),barang[i].getTglKadaluarsa());
        }
    }
}
