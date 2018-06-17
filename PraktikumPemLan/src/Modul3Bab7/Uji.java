package Modul3Bab7;
import java.util.Scanner;
public class Uji {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Bulan Gajian : ");
//        int bulan = in.nextInt();
        Employee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00);
        salariedEmployee.setTanggalLahir(3, 5, 1991);
//        salariedEmployee.setBulanGajian(bulan);//Input Bulan Gajian (Optional)
        Employee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40);
        hourlyEmployee.setTanggalLahir(11, 6, 1990);
//        hourlyEmployee.setBulanGajian(bulan);//Input Bulan Gajian (Optional)
        Employee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06);
        commissionEmployee.setTanggalLahir(30, 7, 1989);
//        commissionEmployee.setBulanGajian(bulan);//Input Bulan Gajian (Optional)
        Employee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04, 300);
        basePlusCommissionEmployee.setTanggalLahir(21, 5, 1992);
//        basePlusCommissionEmployee.setBulanGajian(bulan);//Input Bulan Gajian (Optional)
        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        System.out.println("Employees diproses secara polimorfisme:\n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("Gaji pokok setelah dinaikkan 10%% :$ %,.2f\n", employee.getBaseSalary());
            }
            System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
        }
    }
}
