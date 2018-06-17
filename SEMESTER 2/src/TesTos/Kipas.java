package TesTos;

public class Kipas {

    public boolean isOn;
    public int speed;

    public void statusKipas() {
        if (isOn == false) {
            System.out.println("kecepatan kipas : " + 0);
        } else {
            if (speed < 1) {
                System.out.println("kecepatan kipas : " + 1);
            } else if (speed > 5) {
                System.out.println("kecepatan kipas : " + 5);
            } else {
                System.out.println("kecepatan kipas : " + speed);
            }
        }
    }
}
