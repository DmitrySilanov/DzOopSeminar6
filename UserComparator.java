import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {


    @Override
    public int compare(T o1, T o2) {
        String name0 = o1.getSurname() + o1.getFirstname() + o1.getPatronymic();
        String name1 = o2.getSurname() + o2.getFirstname() + o2.getPatronymic();
        return name0.compareToIgnoreCase(name1);
    }
}
