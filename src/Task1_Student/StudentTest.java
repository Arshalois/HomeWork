// in this class we can count the average score and the info of each Student
// I wrote the counting of average score separately for each student, didn't find out how to write the general one

package Task1_Student;

import Task1_Student.Student;

import javax.naming.Name;

public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Johnny", "Depp", "1st grade student", 1.0, 2.0, 6.0);

        double[] s1Scores = {1.0, 2.0, 6.0};
        double average1 = 0;
        if (s1Scores.length > 0) {
            double sum = 0;
            for (int j = 0; j < s1Scores.length; j++) {
                sum += s1Scores[j];
            }
            average1 = sum / s1Scores.length;


            Student s2 = new Student(2, "Oly", "Monk", "2st grade student", 3.5, 3.0, 1.0);

            double[] s2Scores = {3.5, 3.0, 1.0};
            double average2 = 0;
            if (s2Scores.length > 0) {
                double sum2 = 0;
                for (int h = 0; h < s2Scores.length; h++) {
                    sum2 += s2Scores[h];
                }
                average2 = sum2 / s2Scores.length;

                Student s3 = new Student(89, "Molly");

                double[] s3Scores = {4.5, 3.0, 1.0};
                double average3 = 0;
                if (s3Scores.length > 0) {
                    double sum3 = 0;
                    for (int k = 0; k < s3Scores.length; k++) {
                        sum3 += s3Scores[k];
                    }
                    average3 = sum3 / s3Scores.length;

                }

                System.out.println(s1.Year + " " + s1.studentId + " " + s1.Name + " " + s1.LastName + " " + "Average Score is: " + average1);
                System.out.println(s2.Year + " " + s2.studentId + " " + s2.Name + " " + s2.LastName + " " + "Average Score is: " + average2);
                System.out.println(s3.studentId + " " + s3.Name + " " + "Average Score is: " + average3);
            }
        }
    }
}

