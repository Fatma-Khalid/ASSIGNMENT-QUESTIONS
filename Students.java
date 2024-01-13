import java.util.Scanner;
public class Students {
    private int StudentID;
    private String StudentName;
    private int[] grade;


public Students (int StudentID, String StudentName, int[] grade ){
    this.StudentID = StudentID;
    this.StudentName = StudentName;
    this.grade = grade;
}
public double calculateAverageGrade(){
    int totalgrade =0;
    for (int grade : grade){
        totalgrade +=grade;
    }
    return (double) totalgrade/grade.length;
}

}