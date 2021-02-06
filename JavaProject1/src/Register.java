import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.List;

public class Register {
    private List<Nameable> studentList;



    public Register(List<Nameable> studentList) {

        this.studentList = studentList;

    }

    public List<String> getRegister(){
        List<String> studentNames = new ArrayList<>();
        for (Nameable s:studentList){
            studentNames.add(s.getName());
        }
        return studentNames;
    }


    public List<String> getRegisterByLevel(Level l){
        List<String> studentNamesAtLevel = new ArrayList<>();

        for (Nameable s: studentList){
            if (s.getLevel() == l){
                studentNamesAtLevel.add(s.getName());
            }
        }

        return studentNamesAtLevel;
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
