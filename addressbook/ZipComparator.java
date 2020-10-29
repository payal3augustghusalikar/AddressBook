package addressbook;
import java.util.Comparator;

public class ZipComparator implements Comparator<Person> {
	public int compare(Person zip1, Person zip2) {
		
		if(zip1.zip==zip2.zip)  
			return 0;  
			else if(zip1.zip>zip2.zip) 
				return 1;  
				else  
					return -1;  
		
	}
}
