import java.util.List;

public class NaughtyStudent extends Student{


    public NaughtyStudent(List<Double> grades) {
        super(grades);
    }

    public double getNaughtyAverageGrade(){
        double naughtyGrade = (super.getAverageGrade() * 0.1) + super.getAverageGrade() ;
        return naughtyGrade;
    }
}
