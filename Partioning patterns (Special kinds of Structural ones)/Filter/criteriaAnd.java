import java.util.List;

public class criteriaAnd implements Criteria{
    Criteria x;
    Criteria y;

    public criteriaAnd(Criteria x, Criteria y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
       List<Person>filteredFrom_first_criteria=x.meetCriteria(people);
       List<Person>Final_Answer=y.meetCriteria(filteredFrom_first_criteria);
       return Final_Answer;
    }
}
