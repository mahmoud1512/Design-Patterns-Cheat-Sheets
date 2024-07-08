import java.util.ArrayList;
import java.util.List;

public class criteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person>Selected=new ArrayList<>();
        for (Person person:people) {
            if(person.maritalStatus.equals("Single"))
                Selected.add(person);
        }
        return Selected;
    }
}
