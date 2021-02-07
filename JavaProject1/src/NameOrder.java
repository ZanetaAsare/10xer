import java.util.Comparator;

public class NameOrder implements Comparator<Student> {
    @Override
    public int compare(Student l1, Student l2) {
        return l1.getName().compareTo(l2.getName());
    }
}
