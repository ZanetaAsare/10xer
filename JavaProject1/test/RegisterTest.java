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
        Student std1 = new Student("Zane",grades1, Level.first);

        List<Double> grades2 = new ArrayList<Double>();
        grades2.add(16.0);
        grades2.add(16.0);
        grades2.add(16.0);
        Student std2 = new Student("Yaw",grades2, Level.second);

        List<Double> grades3 = new ArrayList<Double>();
        grades3.add(17.0);
        grades3.add(17.0);
        grades3.add(17.0);
        Student std3 = new Student("Ken",grades3, Level.third);

        List<Student> studentList = new ArrayList<>();
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

    @Test
    void getRegisterByLevel(){
        List<Double> grades1 = new ArrayList<Double>();
        grades1.add(15.0);
        grades1.add(15.0);
        grades1.add(15.0);
        Nameable std1 = new Student("Zane",grades1, Level.first);

        List<Double> grades2 = new ArrayList<Double>();
        grades2.add(16.0);
        grades2.add(16.0);
        grades2.add(16.0);
        Nameable std2 = new Student("Yaw",grades2, Level.first);

        List<Double> grades3 = new ArrayList<Double>();
        grades3.add(17.0);
        grades3.add(17.0);
        grades3.add(17.0);
        Nameable std3 = new Student("Ken",grades3, Level.third);

        List<Nameable> studentList = new ArrayList<>();
        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);

        List<String> stdNameLevel = new ArrayList<>();
        stdNameLevel.add("Zane");
        stdNameLevel.add("Yaw");

//        Register studentNames = new Register(studentList);
//
//        Assertions.assertEquals(stdNameLevel, studentNames.getRegisterByLevel(Level.first));
    }

    @Test
    void printReport(){
        List<Double> grades1 = new ArrayList<Double>();
        grades1.add(15.0);
        grades1.add(15.0);
        grades1.add(15.0);
        Nameable std1 = new Student("Zane",grades1, Level.first);

        List<Double> grades2 = new ArrayList<Double>();
        grades2.add(16.0);
        grades2.add(16.0);
        grades2.add(16.0);
        Nameable std2 = new Student("Yaw",grades2, Level.first);

        List<Double> grades3 = new ArrayList<Double>();
        grades3.add(17.0);
        grades3.add(17.0);
        grades3.add(17.0);
        Nameable std3 = new Student("Ken",grades3, Level.third);

        List<Nameable> studentList = new ArrayList<>();
        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);


//        Register studentNames = new Register(studentList);

        String allStudentsByLevel = "first";
//        Assertions.assertEquals(allStudentsByLevel, studentNames.printReport());
    }

    @Test
    void sort(){
        List<Double> grades1 = new ArrayList<Double>();
        grades1.add(15.0);
        grades1.add(15.0);
        grades1.add(15.0);
        Student std1 = new NaughtyStudent("Zane",grades1);

        List<Double> grades2 = new ArrayList<Double>();
        grades2.add(16.0);
        grades2.add(16.0);
        grades2.add(16.0);
        Student std2 = new NaughtyStudent("Yaw",grades2);

        List<Double> grades3 = new ArrayList<Double>();
        grades3.add(17.0);
        grades3.add(17.0);
        grades3.add(17.0);
        Student std3 = new NaughtyStudent("Ken",grades3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);

        Register studentNames = new Register(studentList);

        Assertions.assertEquals("Zane", studentNames.sort());
    }

    @Test
    void getStudentByName(){
        List<Double> grades1 = new ArrayList<Double>();
        grades1.add(15.0);
        grades1.add(15.0);
        grades1.add(15.0);
        Student std1 = new NaughtyStudent("Zane",grades1);

        List<Double> grades2 = new ArrayList<Double>();
        grades2.add(16.0);
        grades2.add(16.0);
        grades2.add(16.0);
        Student std2 = new NaughtyStudent("Yaw",grades2);

        List<Double> grades3 = new ArrayList<Double>();
        grades3.add(17.0);
        grades3.add(17.0);
        grades3.add(17.0);
        Student std3 = new NaughtyStudent("Ken",grades3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);

        Register studentNames = new Register(studentList);
        Assertions.assertEquals(std1, studentNames.getStudentByName("Zane"));
    }
}