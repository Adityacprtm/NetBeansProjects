package generic;

public class Costume {

    private String keperluan;
    private int kuantitas;

    public Costume(String keperluan, int kuantitas) {
        this.keperluan = keperluan;
        this.kuantitas = kuantitas;
        totring();
    }

    public void totring() {
        System.out.println("Costume{" + "keperluan=" + keperluan + ", kuantitas=" + kuantitas + '}');
    }

}
