package ADT_Larik;
public class Larik12 {
    private int size;
    private double[] itemDt;
    public void buatLarik(int n) {
        this.size = n;
        this.itemDt = new double[this.size];
    }
    public Larik12(int n) {
        buatLarik(n);
    }
    public int getSize() {
        return this.size;
    }
    public Larik12(double[] dt) {
        buatLarik(dt.length);
        for (int i = 0; i < dt.length; i++) {
            isiItem(i, dt[i]);
        }
    }
    public void isiItem(int id, double dt) {
        this.itemDt[id] = dt;
    }
    public void cetak(String komentar) {
        System.out.println(komentar);
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.itemDt[i] + " ");
        }
        System.out.println();
    }
    public double findBesar() {
        double besar = this.itemDt[0];
        for (int i = 1; i < this.size; i++) {
            if (besar < this.itemDt[i]) {
                besar = this.itemDt[i];
            }
        }
        return besar;
    }
    public int getPosisi(int dtCari) {
        int pos = -99;
        boolean ketemu = false;
        int i = 0;
        while (!ketemu && i < this.size) {
            if (dtCari == this.itemDt[i]) {
                ketemu = true;
                pos = i;
            }
            i++;
        }
        return pos;
    }
    private int getPosMax(int id) {
        double max = this.itemDt[id];
        int posMax = id;
        for (int i = id + 1; i < size; i++) {
            if (max <= this.itemDt[i]) {
                max = this.itemDt[i];
                posMax = i;
            }
        }
        return posMax;
    }
    private int getPosMin(int id) {
        double min = this.itemDt[id];
        int posMin = id;
        for (int i = id + 1; i < size; i++) {
            if (min >= this.itemDt[i]) {
                min = this.itemDt[i];
                posMin = i;
            }
        }
        return posMin;
    }
    public int PencarianBiner(int dtCari, int awal, int akhir) {
        int pos = -99;
        int tengah = (awal + akhir) / 2;
        if (dtCari < this.itemDt[tengah]) {
            return PencarianBiner(dtCari, awal, tengah);
        } else if (dtCari > this.itemDt[tengah]) {
            return PencarianBiner(dtCari, tengah + 1, akhir);
        } else if (dtCari == this.itemDt[tengah]) {
            return tengah;
        } else {
            return pos;
        }
    }
    public Larik12 copyLarik(int k, int n) {
        Larik12 lHasil = null;
        if (n <= this.size - k) {
            lHasil = new Larik12(n);
            int j = 0;
            for (int i = k; i < k + n; i++) {
                lHasil.isiItem(j++, this.itemDt[i]);
            }
        }
        return lHasil;
    }
    public Larik12 SelectionSort(int pilihan) {
        Larik12 lsort = copyLarik(0, size);
        for (int i = 0; i < lsort.getSize(); i++) {
            int posData;
            if (pilihan == 0) {
                posData = lsort.getPosMin(i);
            } else {
                posData = lsort.getPosMax(i);
            }
            double dt1 = lsort.itemDt[i];
            double dt2 = lsort.itemDt[posData];
            lsort.itemDt[i] = dt2;
            lsort.itemDt[posData] = dt1;
        }
        return lsort;
    }
    public void findPosGenap(int x1, int x2) {
        double genap;
        for (int i = x1; i <= x2; i++) {
            for (int j = 0; j < size; j++) {
                if (itemDt[j] == i) {
                    if (itemDt[j] % 2 == 0) {
                        genap = itemDt[j];
                        System.out.println(genap + " di indeks " + j);
                    }
                }
            }
        }
    }
    public static double LarikKaliLarik(Larik12 l1, Larik12 l2) {
        double hasilKali = 0;
        for (int i = 0; i < l1.size; i++) {
            for (int j = 0; j < l2.size; j++) {
                if (i == j) {
                    hasilKali = hasilKali + l1.itemDt[i] * l2.itemDt[j];
                }
            }
        }
        return hasilKali;
    }
    private static void BubbleSort(int[] dtArray, int status) {
        int i, j, k, temp;
        for (i = 1; i < dtArray.length - 1; i++) {
            System.out.println("Buble Sort ke - " + i);
            if (status == 0) { //0 = kecil ke besar
                for (j = dtArray.length - 1; j >= i; j--) {
                    if (dtArray[j - 1] > dtArray[j]) {
                        temp = dtArray[j];
                        dtArray[j] = dtArray[j - 1];
                        dtArray[j - 1] = temp;
                    }
                }
            } else { // lainnya = besar ke kecil
                for (j = dtArray.length - 1; j >= i; j--) {
                    if (dtArray[j - 1] < dtArray[j]) {
                        temp = dtArray[j];
                        dtArray[j] = dtArray[j - 1];
                        dtArray[j - 1] = temp;
                    }
                }
            }
            for (k = 0; k < dtArray.length; k++) {
                System.out.print(dtArray[k] + "   ");
            }
            System.out.println();
        }
    }

    public static Larik12 copyLarik1(int k, int n, Larik12 l) {
        double larikCopy[] = new double[n];
        if (n <= l.size - k) {
            for (int i = 0; i < n; i++) {
                larikCopy[i] = l.itemDt[k++];
            }
        }
        Larik12 larik = new Larik12(larikCopy);
        return larik;
    }
    public double getItem(int i) {
        return this.itemDt[i];
    }
    public static Larik12 mergeSort(Larik12 list) {
        if (list.size <= 1) {
            return list;
        }
        double[] first = new double[list.size / 2];
        double[] second = new double[list.size - first.length];
        Larik12 first2 = new Larik12(first);
        Larik12 second2 = new Larik12(second);
        first2 = copyLarik1(0, first.length, list);
        second2 = copyLarik1(first.length, second.length, list);
        mergeSort(first2);
        mergeSort(second2);
        merge(first2, second2, list);
        return list;
    }
    private static void merge(Larik12 first, Larik12 second, Larik12 result) {
        int iFirst = 0;
        int iSecond = 0;
        result.cetak("result");
        int j = 0;
        while (iFirst < first.size && iSecond < second.size) {
            if (first.getItem(iFirst) < second.getItem(iSecond)) {
                result.isiItem(j, first.getItem(iFirst));
                iFirst++;
            } else {
                result.isiItem(j, second.getItem(iSecond));
                iSecond++;
            }
            j++;
        }
        Larik12 first2 = copyLarik1(0, first.size, result);
        Larik12 second2 = copyLarik1(first.size, second.size, result);
    }
}
