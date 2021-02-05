import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {
    @Test
    void getNaughtyAverageGrade(){
        List<Double> grades = new ArrayList<Double>();
        grades.add(15.0);
        grades.add(15.0);
        grades.add(15.0);
        NaughtyStudent naughtyStd = new NaughtyStudent(grades);
        Assertions.assertTrue(naughtyStd.getNaughtyAverageGrade() > naughtyStd.getAverageGrade());

//        Assertions.assertEquals(16.5, naughtyStd.getNaughtyAverageGrade());
//        Assertions.assertTrue(naughtyStd instanceof Student);
    }

}