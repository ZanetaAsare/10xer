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
}
