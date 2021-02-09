import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAverageGrade() {
        List<Double> grades = new ArrayList<Double>();
        grades.add(15.0);
        grades.add(15.0);
        grades.add(15.0);
        Student std = new Student("joe",grades, Level.first);
        Assertions.assertEquals(15.0, std.getAverageGrade());
    }
      @Test
    void  getGrades(){
        DoubleStream s = DoubleStream.of(2,3.4);
        List<Double> grades = new ArrayList<Double>();
        grades.add(15.0);
        grades.add(15.0);
        grades.add(15.0);
        Student std = new Student("joe",grades, Level.first);
        Assertions.assertEquals(s, std.getGrades());
    }
}