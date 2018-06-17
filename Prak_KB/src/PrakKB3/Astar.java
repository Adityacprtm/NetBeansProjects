package PrakKB3;

public class Astar {

    Graph as;
    int[] ds = {180, 90, 89, 0, 110, 79, 100};

    public Astar() {
        as = new Graph(7);
        as.addAdj(0, 1, 79);
        as.addAdj(0, 5, 81);
        as.addAdj(0, 6, 63);
        as.addAdj(1, 2, 131);
        as.addAdj(1, 3, 109);
        as.addAdj(1, 6, 55);
        as.addAdj(2, 3, 88);
        as.addAdj(3, 4, 92);
        as.addAdj(3, 5, 126);
        as.addAdj(4, 5, 148);
        as.addAdj(5, 6, 60);

        as.addAdj(1, 0, 79);
        as.addAdj(5, 0, 81);
        as.addAdj(6, 0, 63);
        as.addAdj(2, 1, 131);
        as.addAdj(3, 1, 109);
        as.addAdj(6, 1, 55);
        as.addAdj(3, 2, 88);
        as.addAdj(4, 3, 92);
        as.addAdj(5, 3, 126);
        as.addAdj(5, 4, 148);
        as.addAdj(6, 5, 60);
    }

    public char ubah(int a) {
        switch (a) {
            case 0:
                return 'A';
            case 1:
                return 'B';
            case 2:
                return 'C';
            case 3:
                return 'D';
            case 4:
                return 'E';
            case 5:
                return 'F';
            case 6:
                return 'G';
            default:
                return 'S';
        }
    }

    public boolean ceklist(int[] ko, int f) {
        boolean s = true;
        for (int i : ko) {
            if (i == f) {
                s = s && false;
            }
        }
        return s;
    }

    public void bintang(int n) {
        int now = n, terkecil;
        int jalur[];
        int kode[] = new int[0];
        int f[];
        while (now != 3) {
            System.out.println("Node saat ini:" + ubah(now));
            System.out.println("perhitungan:");
            terkecil = 1000;
            jalur = as.getNode(now);
            f = new int[(int) Math.floor(jalur.length / 2)];
            for (int i = 0; i < f.length; i++) {
                f[i] = jalur[(i * 2) + 1] + ds[jalur[i * 2]];
                System.out.print(f[i] + "  ");
                if ((terkecil > f[i]) && ceklist(kode, jalur[i * 2])) {
                    terkecil = f[i];
                }
            }
            System.out.println("");
            kode = as.arraylong(kode, now);
            for (int i = 0; i < f.length; i++) {
                if (terkecil == f[i]) {
                    now = jalur[i * 2];
                }
            }
            System.out.println("Berpindah ke node :" + ubah(now));
            if (now == 3) {
                kode = as.arraylong(kode, now);
            }
        }
        System.out.println("Tujuan telah ditemukan");
        for (int i = 0; i < kode.length; i++) {
            System.out.print(ubah(kode[i]) + "->");
        }
        System.out.println("finish");
    }
}
