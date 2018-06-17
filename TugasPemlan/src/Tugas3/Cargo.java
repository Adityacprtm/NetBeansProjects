package Tugas3;

public class Cargo extends Taxi {

    public static enum CargoType {
        ELECTRONICS, CLOTHES, FOODS, DOCUMENTS, GOODS
    }
    private CargoType cargoType;
    private int cargoWeight;
    private boolean fragile;

    public Cargo(String driverName, String plateNumber, String from, String destination, int kilometers, CargoType cargoType, int cargoWeight, boolean fragile) {
        super(driverName, plateNumber, from, destination, kilometers);
        this.cargoType = cargoType;
        this.cargoWeight = cargoWeight;
        this.fragile = fragile;
    }

    public CargoType getCargoType() {
        return cargoType;
    }

    public void setCargoType(CargoType cargoType) {
        this.cargoType = cargoType;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean isFragile) {
        this.fragile = fragile;
    }

    private int tempCost() {
        int cost;
        if (super.getKilometers() % 10 == 0) {
            cost = ((super.getKilometers() / 10) * 5000) + (this.getCargoWeight() * 10000) + 2500;
            return cost;
        } else if (super.getKilometers() < 10) {
            cost = 5000 + (this.getCargoWeight() * 10000) + 2500;
            return cost;
        } else {
            cost = (((int) super.getKilometers() / 10 + 1) * 5000) + (this.getCargoWeight() * 10000) + 2500;
            return cost;
        }
    }

    public int cost() {
        int cost;
        if (this.isFragile() == true) {
            cost = this.tempCost() + 2500;
            return cost;
        } else {
            cost = this.tempCost();
            return cost;
        }
    }

    @Override
    public Cargo clone() throws CloneNotSupportedException {
        Cargo clone = (Cargo) super.clone();
        clone.setCargoType(this.getCargoType());
        clone.setCargoWeight(this.getCargoWeight());
        clone.setFragile(this.isFragile());
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
        final Cargo other = (Cargo) obj;
        if (this.cargoWeight != other.cargoWeight) {
            return false;
        }
        if (this.fragile != other.fragile) {
            return false;
        }
        if (this.cargoType != other.cargoType) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (fragile == true) {
            return (super.toString() + "Cargo type\t: " + cargoType + "\nCargo weight\t: " + cargoWeight + " kg\nFragile\t\t: Yes\nCost\t\t: Rp " + cost() + "\n");
        } else {
            return (super.toString() + "Cargo type\t: " + cargoType + "\nCargo weight\t: " + cargoWeight + " kg\nFragile\t\t: No\nCost\t\t: Rp " + cost() + "\n");
        }
    }
}
