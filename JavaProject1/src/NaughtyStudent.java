import java.util.List;

public class NaughtyStudent extends Student{


    public NaughtyStudent(String studentName,List<Double> grades) {
        super(studentName,grades, Level.second);
    }

    public double getNaughtyAverageGrade(){
        double naughtyGrade = (super.getAverageGrade() * 0.1) + super.getAverageGrade() ;
        return naughtyGrade;
    }
}
