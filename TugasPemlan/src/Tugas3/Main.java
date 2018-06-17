package Tugas3;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Taxi[] taxi = new Taxi[3];
        taxi[0] = new Argo("Ronaldo", "N 7000 Z", "Dinoyo", "Cybermall", 7, 50);
        taxi[1] = new Cargo("Messi", "B 4218 CA", "Malang", "Surabaya", 98, Cargo.CargoType.ELECTRONICS, 3, true);
        taxi[2] = new Travel("Vardy", "L 5971 QB", "Malang", "Bromo", 30, 6);

        for (Taxi AllTaxi : taxi) {
            System.out.println(AllTaxi);
        }

        Argo argoClone = (Argo) taxi[0].clone();
        System.out.println(argoClone.equals(taxi[0]));
        argoClone.setVelocity(80);
        System.out.println(argoClone.equals(taxi[0]));
        
        System.out.println(taxi[0].compareTo(taxi[1]));
    }
}
