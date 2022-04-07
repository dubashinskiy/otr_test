import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.parseInt(o2.getAge()) - Integer.parseInt(o1.getAge());
    }
}
