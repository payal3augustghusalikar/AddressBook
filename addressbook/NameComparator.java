package addressbook;
import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
	public int compare(Person person1, Person person2) {
		return person1.firstName.compareTo(person2.firstName);
	}

}