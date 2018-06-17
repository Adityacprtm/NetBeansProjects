package AbstractClass;

public abstract class Mamals extends Animal {

    private int legCount;
    private int armCount;

    public Mamals() {
        this.legCount = 2;
        this.armCount = 2;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public int getArmCount() {
        return armCount;
    }

    public void setArmCount(int armCount) {
        this.armCount = armCount;
    }
}
