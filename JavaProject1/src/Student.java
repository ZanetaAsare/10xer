import java.util.ArrayList;
import java.util.List;

public class Student implements Nameable, HasLevel{
    private String studentName;
    private List<Double> studentGrades = new ArrayList<Double>();
    private Level studentLevel;

    public Student(String studentName,List<Double> grades, Level studentLevel){
        this.studentName = studentName;
        this.studentGrades = grades;
        this.studentLevel = studentLevel;
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

    @Override
    public Level getLevel() {
        return this.studentLevel;
    }
}
