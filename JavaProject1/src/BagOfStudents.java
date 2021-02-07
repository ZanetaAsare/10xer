import java.util.ArrayList;
import java.util.List;

public class BagOfStudents {

    Bag<Student> students = new Bag<>();

    public void add(Student std){
      students.add(std);
    }

    public void remove(Student std){
     students.remove(std);
    }

    public  void clear(){
        students.clear();
    }
}
