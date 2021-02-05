import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void getRegister() {
        List<Double> grades1 = new ArrayList<Double>();
        grades1.add(15.0);
        grades1.add(15.0);
        grades1.add(15.0);
        Nameable std1 = new Student("Zane",grades1);

        List<Double> grades2 = new ArrayList<Double>();
        grades2.add(16.0);
        grades2.add(16.0);
        grades2.add(16.0);
        Nameable std2 = new Student("Yaw",grades2);

        List<Double> grades3 = new ArrayList<Double>();
        grades3.add(17.0);
        grades3.add(17.0);
        grades3.add(17.0);
        Nameable std3 = new Student("Ken",grades3);

        List<Nameable> studentList = new ArrayList<>();
        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);

        Register studentNames = new Register(studentList);
        List<String> names= new ArrayList<>();
        names.add("Zane");
        names.add("Yaop");
        names.add("Ken");
        Assertions.assertEquals(names,studentNames.getRegister());
        //Assertions.assertEquals(17, studentGroup.getHighestAverageGrade());
    }
}