public class Student {
    private String Name;
    private int course;
    private int grade;

    public String getName() {
        return Name;
    }

    public void setName(String Name1) {
        if (Name.lenght > 3) {
            Name = Name1;
        }
    }
    public int getCourse(){
        return course;
    }
    public void setCourse(int course1){
        if (course<=4 && course >=1){
            course=course1;
        }
    }

    public int getGrade(){
        return grade;
    }
    public void setGrade(int grade1){
        if (grade<=10 && course<=1){
            grade=grade1;
        }
    }
    public Student (String Name,int course,int grade){
        this.Name = Name;
        this.course = course;
        this.grade = grade;
    }

    Student student1 = new Student("Brad", 4,10)

    public static showInfo {

        System.out.println(student1.Name + " " + student1.course + " " + student1.grade);
    }

    public static void main(String[] args) {
        student1.showInfo();
        showInfo ();
    }
}
