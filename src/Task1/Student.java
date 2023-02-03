package Task1;

public class Student {
    private static String Name;
    private static int course;
    private static int grade;

    public static String getName() {
        return Name;
    }

    public void setName(String Name1) {
        if (Name1.length() >= 3) {
            Name = Name1;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course1) {
        if (course1 <= 4 && course1 >= 1) {
            course = course1;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade1) {
        if (grade1 <= 10 && grade1 >= 1) {
            grade = grade1;
        }
    }

    public Student() {
        this.Name = Name;
        this.course = course;
        this.grade = grade;
    }

    public void showInfo() {
        System.out.println(Student.Name + " " + Student.course + " " + Student.grade);

    }


}