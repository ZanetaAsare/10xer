import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {
    private List<Student> students = new ArrayList<Student>();

    public Lecture(List<Student> students){
        this.students = students;
    }

    public void enter(Student std){
        this.students.add(std);
    }

    public double getHighestAverageGrade(){
        List<Double> studentAverageGrades = new ArrayList<Double>();

        for (Student std : this.students){
            studentAverageGrades.add(std.getAverageGrade());
        }

        double maxVal = Collections.max(studentAverageGrades);

        return maxVal;
    }
}
