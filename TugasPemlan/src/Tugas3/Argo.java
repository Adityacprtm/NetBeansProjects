package Tugas3;

public class Argo extends Taxi {

    private int velocity;

    public Argo(String driverName, String plateNumber, String from, String destination, int kilometers, int velocity) {
        super(driverName, plateNumber, from, destination, kilometers);
        this.velocity = velocity;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int cost() {
        double minutes = ((double) super.getKilometers() / this.getVelocity()) * 60;
        int costPerMinutes = (int) minutes * 2000;
        return costPerMinutes;
    }

    @Override
    public Argo clone() throws CloneNotSupportedException {
        Argo clone = (Argo) super.clone();
        clone.setVelocity(this.getVelocity());
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
        final Argo other = (Argo) obj;
        if (this.velocity != other.velocity) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return (super.toString() + "Speed\t\t: " + velocity + " km/h\nCost\t\t: Rp " + cost() + "\n");
    }

}
