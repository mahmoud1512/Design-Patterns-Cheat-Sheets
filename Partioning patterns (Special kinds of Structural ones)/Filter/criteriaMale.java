import java.util.ArrayList;
import java.util.List;

public class criteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person>Selected=new ArrayList<>();
        for (Person person:people) {
            if(person.gender.equals("male"))
                Selected.add(person);
        }
        return Selected;
    }
}
