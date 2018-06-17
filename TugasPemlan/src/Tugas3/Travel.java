package Tugas3;

public class Travel extends Taxi {

    private int numberOfPassangers;

    public Travel(String driverName, String plateNumber, String from, String destination, int kilometers, int numberOfPassangers) {
        super(driverName, plateNumber, from, destination, kilometers);
        this.numberOfPassangers = numberOfPassangers;
    }

    public int getNumberOfPassangers() {
        return numberOfPassangers;
    }

    public void setNumberOfPassangers(int numberOfPassangers) {
        this.numberOfPassangers = numberOfPassangers;
    }

    public int cost() {
        int cost;
        if (super.getKilometers() % 50 == 0) {
            cost = (super.getKilometers() / 50) * 50000 * this.getNumberOfPassangers();
            return cost;
        } else if (super.getKilometers() < 50) {
            cost = 50000;
            return cost;
        } else {
            cost = ((int) super.getKilometers() / 50 + 1) * 50000 * this.getNumberOfPassangers();
            return cost;
        }

    }

    @Override
    public Travel clone() throws CloneNotSupportedException {
        Travel clone = (Travel) super.clone();
        clone.setNumberOfPassangers(this.getNumberOfPassangers());
        return clone;
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj) == false) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Travel other = (Travel) obj;
        if (this.numberOfPassangers != other.numberOfPassangers) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return (super.toString() + "Passsangers\t: " + numberOfPassangers + "\nCost\t\t: Rp " + cost() + "\n");
    }
}
