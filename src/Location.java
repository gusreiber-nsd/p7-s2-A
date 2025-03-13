
import java.util.ArrayList;


public class Location {
    private ArrayList<Person> persons;

    Location(){
        this.persons = new ArrayList<>();
    }

    public void add(Person p){
        this.persons.add(p);
    }
}
