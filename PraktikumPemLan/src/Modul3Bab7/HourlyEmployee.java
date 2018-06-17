package Modul3Bab7;
public class HourlyEmployee extends Employee {
    private double wage; //upah per jam
    private double hours; //jumlah jam tiap minggu
    public HourlyEmployee(String name, String noKTP, double hourlyWage, double hoursWorked) {
        super(name, noKTP);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }
    public void setWage(double hourlyWage) {
        wage = hourlyWage;
    }
    public double getWage() {
        return wage;
    }
    public void setHours(double hoursWorked) {
        hours = hoursWorked;
    }
    public double getHours() {
        return hours;
    }
    @Override
    public double earnings() {
        if (getHours() <= 40) {
            return (getWage() * getHours()) * 4 + getBonusBulanLahir();//ditambah bonus
        } else {
            return (40 * getWage() + (getHours() - 40) * getWage() * 1.5) * 4 + getBonusBulanLahir();//ditambah bonus
        }
    }
    @Override
    public String toString() {
        return String.format("Hourly employee: " + super.toString() + "\nhourly wage: " + getWage() + "\nhours worked: " + getHours());
    }
}
//    private double wage; //upah per jam
//    private double hours; //jumlah jam tiap minggu
//
//    public HourlyEmployee(String name, String noKTP,
//            double hourlyWage, double hoursWorked) {
//        super(name, noKTP);
//        setWage(hourlyWage);
//        setHours(hoursWorked);
//    }
//
//    public void setWage(double hourlyWage) {
//        wage = hourlyWage;
//    }
//
//    public double getWage() {
//        return wage;
//    }
//
//    public void setHours(double hoursWorked) {
//        hours = hoursWorked;
//    }
//
//    public double getHours() {
//        return hours;
//    }
//
//    public double earnings() {
//        if (getHours() <= 40) {
//            return getWage() * getHours();
//        } else {
//            return 40 * getWage() + (getHours() - 40)
//                    * getWage() * 1.5;
//        }
//    }
//
//    public String toString() {
//        return String.format("Hourly employee: " + super.toString() + "\nhourly wage " + getWage() + "\nhours worked: " + getHours());
//    }
//}
