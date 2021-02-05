import java.util.ArrayList;
import java.util.List;

public class Student implements Nameable{
    private String studentName;
    private List<Double> studentGrades = new ArrayList<Double>();

    public Student(String studentName,List<Double> grades){
        this.studentName = studentName;
        this.studentGrades = grades;
    }

    public double getAverageGrade(){
        double averageGrade, totalGrade = 0.0;
        for(double grade : this.studentGrades){
            totalGrade += grade;
        }
        averageGrade = totalGrade / this.studentGrades.size();
        return averageGrade;
    }


    @Override
    public String getName() {
        return studentName;
    }
}
