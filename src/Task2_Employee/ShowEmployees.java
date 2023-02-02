// in this class we have 3 objects, here use the methods from Employee class, also here we can see public and default variables

package Task2_Employee;

public class ShowEmployees {

    public static void main(String[] args) {
        Employee empl1 = new Employee(1050, "Pitt", 5);
        Employee empl2 = new Employee(1200, "Moris", 300);
        Employee empl3 = new Employee(230, "Smith");

        System.out.println(empl3.Surname);
        System.out.println(empl2.id);
        empl1.printInfo();
        empl2.printInfo();
        empl1.showId();
    }
}