import java.util.ArrayList;
import java.util.List;

public class BagOfLectures {
   // List<Lecture> lectures = new ArrayList<>();
    Bag<Lecture> lectures = new Bag<>();

    public void add(Lecture lecture){
        lectures.add(lecture);
    }

    public void remove(Lecture lecture){
        lectures.remove(lecture);
    }
    public void clear(){
        lectures.clear();
    }
}
