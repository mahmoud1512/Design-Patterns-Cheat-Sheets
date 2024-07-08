import java.util.List;

public class criteriaOR implements Criteria{
    Criteria x;
    Criteria y;
    public criteriaOR(Criteria x, Criteria y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person>Filtered_From_First_Criteria=x.meetCriteria(people);
        List<Person>Filtered_From_Second_Criteria=y.meetCriteria(people);
        for (Person person:Filtered_From_Second_Criteria) {
            if(!(Filtered_From_First_Criteria.contains(person)))
                Filtered_From_First_Criteria.add(person);
        }
        return Filtered_From_First_Criteria;
    }
}
