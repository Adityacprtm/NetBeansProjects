package Tugas3;

import java.util.Objects;

public abstract class Taxi implements Comparable, Cloneable {

    protected String driverName;
    protected String plateNumber;
    protected String from;
    protected String destination;
    protected int kilometers;

    public Taxi(String driverName, String plateNumber, String from, String destination, int kilometers) {
        this.driverName = driverName;
        this.plateNumber = plateNumber;
        this.from = from;
        this.destination = destination;
        this.kilometers = kilometers;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public int compareTo(Object o) {
        if (this.cost() > ((Taxi) o).cost()) {
            return 1;
        } else if (this.cost() < ((Taxi) o).cost()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public Taxi clone() throws CloneNotSupportedException {
        return (Taxi) super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Taxi other = (Taxi) obj;
        if (this.kilometers != other.kilometers) {
            return false;
        }
        if (!Objects.equals(this.driverName, other.driverName)) {
            return false;
        }
        if (!Objects.equals(this.plateNumber, other.plateNumber)) {
            return false;
        }
        if (!Objects.equals(this.from, other.from)) {
            return false;
        }
        if (!Objects.equals(this.destination, other.destination)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ("Driver Name\t: " + driverName + "\nPlate Number\t: " + plateNumber + "\nFrom\t\t: " + from + "\nDestination\t: " + destination + "\nDistance\t: " + kilometers + " km\n");
    }
    public abstract int cost();
}
