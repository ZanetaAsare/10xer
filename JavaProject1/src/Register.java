import com.sun.jdi.ArrayReference;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Register {
    private List<Student> studentList;


    public Register(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Student checkStudentName(String studentName) throws StudentNotFoundException{
        boolean studentExists = false;
        List<Student> student = studentList.stream().filter(s->s.getName().equals(studentName)).collect(Collectors.toList());

        if(student.isEmpty()){
            throw new StudentNotFoundException();
        }
        return student.get(0);
    }

    public Student getStudentByName(String studentName ){
        Student std = null;
        try{
            std = checkStudentName(studentName);

        }catch (StudentNotFoundException e){
            System.out.println("Error");
        }
        return std;
    }

    public List<String> getRegister() {
        List<String> studentNames = new ArrayList<>();
       studentNames = studentList.stream().map(s->s.getName()).collect(Collectors.toList());
        return studentNames;
    }


    public Map<Level, List<Student>> getRegisterByLevel(Level l) {
        Map<Level, List<Student>> studentLevelAndList = new HashMap<>();

        List<Student> studentNamesAtLevel = new ArrayList<>();
         studentNamesAtLevel = studentList.stream().filter(s->s.getLevel()==l).collect(Collectors.toList());

        studentLevelAndList.put(l, studentNamesAtLevel);

        return studentLevelAndList;
    }

    public List<String> sort(){
        List<String> sortedStudentList = new ArrayList<>();
        Collections.sort(studentList, new NameOrder());
        sortedStudentList = studentList.stream().map(s->s.getName()).collect(Collectors.toList());

        return sortedStudentList;
    }

   public double getHighestGrade(){
      List grades =  studentList.stream().map(g->g.getGrades().max()).collect(Collectors.toList());
      return  3.0;
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
