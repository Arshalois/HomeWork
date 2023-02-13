// this class has the constructor, and in main we see the public variables from Employee class (different package from Task2)

package Task1_Student;

import Task2_Employee.Employee;

public class Student {

    int studentId;
    String Name;
    String LastName;
    String Year;
    double scoreMath;
    double scoreEconomy;
    double scoreLanguage;


    Student(int studentId, String Name, String LastName, String Year, double scoreMath, double scoreEconomy, double scoreLanguage) {
        this.Name = Name;
        this.studentId = studentId;
        this.LastName = LastName;
        this.Year = Year;
        this.scoreEconomy = scoreEconomy;
        this.scoreLanguage = scoreLanguage;
        this.scoreMath = scoreMath;
    }

    Student(int studentId, String Name) {
        this.Name = Name;
        this.studentId = studentId;
        this.LastName = LastName;
        this.scoreEconomy = scoreEconomy;
        this.scoreLanguage = scoreLanguage;
        this.scoreMath = scoreMath;

    }

    public static void main(String[] args) {
        Employee fromOtherClass = new Employee(5600, "Gold",456);
        System.out.println(fromOtherClass.Surname);
        fromOtherClass.printInfo();


    }


}
