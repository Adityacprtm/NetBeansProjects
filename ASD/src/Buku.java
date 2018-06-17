
class Buku {

    private String judul;
    private String pengarang;

    public Buku(String jdl, String peng) {
        this.judul = jdl;
        this.pengarang = peng;
    }

    public String toString() {
        return String.format("%s %s", this.judul, this.pengarang);
    }
}
