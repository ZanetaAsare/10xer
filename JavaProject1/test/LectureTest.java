import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

    @Test
    void getHighestAverageGrade() {
        List<Double> grades1 = new ArrayList<Double>();
        grades1.add(15.0);
        grades1.add(15.0);
        grades1.add(15.0);
        Student std1 = new Student("Zane",grades1, Level.first);

        List<Double> grades2 = new ArrayList<Double>();
        grades2.add(16.0);
        grades2.add(16.0);
        grades2.add(16.0);
        Student std2 = new Student("Yao",grades2, Level.second);

        List<Double> grades3 = new ArrayList<Double>();
        grades3.add(17.0);
        grades3.add(17.0);
        grades3.add(17.0);
        Student std3 = new Student("Ken",grades3, Level.third);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);

        Lecture studentGroup = new Lecture(studentList);

        Assertions.assertEquals(17, studentGroup.getHighestAverageGrade());
    }
}

