//this class has 3 public methods, 3 constructors with different access modifiers and here we can see the private variable - salary.

package Task2_Employee;

public class Employee {
    private int salary;
    public String Surname;
    int id;

    public void printInfo() {
        System.out.println(salary+ " " +Surname + " "+ id);
     }
     public void showPrivateSalary (){
         System.out.println(salary);
     }
     public void showId (){
         System.out.println(id);
     }

    public Employee(int salary,String Surname,int id){
        this.salary=salary;
        this.Surname=Surname;
        this.id=id;
    }
    private Employee (int salary){
        this.salary=salary;
    }
    Employee (int id, String Surname){
        this.id=id;
        this.Surname=Surname;

    }

    public static void main(String[] args) {
        Employee privateEmpl = new Employee(2300);
        Employee empl0 = new Employee(123, "Laurens");
        privateEmpl.showPrivateSalary();
        empl0.showId();

    }

    }

