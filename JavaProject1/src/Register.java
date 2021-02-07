import com.sun.jdi.ArrayReference;

import java.util.*;

public class Register {
    private List<Student> studentList;


    public Register(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<String> getRegister() {
        List<String> studentNames = new ArrayList<>();
        for (Student s : studentList) {
            studentNames.add(s.getName());
        }
        return studentNames;
    }


    public Map<Level, List<Student>> getRegisterByLevel(Level l) {
        Map<Level, List<Student>> studentLevelAndList = new HashMap<>();

        List<Student> studentNamesAtLevel = new ArrayList<>();

        for (Student s : studentList) {
            if (s.getLevel() == l) {
                studentNamesAtLevel.add(s);

            }
        }

        studentLevelAndList.put(l, studentNamesAtLevel);

        return studentLevelAndList;
    }

    public List<String> sort(){
        List<String> sortedStudentList = new ArrayList<>();
        Collections.sort(studentList, new NameOrder());

        for (Student s: studentList) {
            sortedStudentList.add(s.getName());
        }
        return sortedStudentList;
    }


    public String printReport(){
        String report = "";

        for (Level l: Level.values()){
            report += (l.name() + "\n");

            String oneLevel = getRegisterByLevel(l).toString();

            report += (oneLevel + "\n");
        }
        return report;
    }


}
