import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
//        Person monica=new Person("monica","Single","Female")
//        Person Alice=new Person("Alice","Married","Female")
//        Person Tara=new Person("tara","Single","Female")
//        Person Ahmed=new Person("Ahmed","Single","male")
//        Person Mahmoud=new Person("Mahmoud","Single","male")
//        Person Tarek=new Person("tarek","Married","male")
//        Person rafy=new Person("rafy","Married","male")
        List<Person>demo=new ArrayList<>(Arrays.asList(new Person("monica","Single","Female"),new Person("Alice","Married","Female"),new Person("tara","Single","Female"),new Person("Ahmed","Single","male"),new Person("Mahmoud","Single","male"),new Person("tarek","Married","male"),new Person("rafy","Married","male")));
        Criteria criteria=new criteriaMale();
        for (Person x:criteria.meetCriteria(demo)) {
            System.out.println(x.name);
        }
        System.out.println();
        criteria=new criteriaSingle();
        for (Person x:criteria.meetCriteria(demo)) {
            System.out.println(x.name);
        }
        System.out.println();

        criteria=new criteriaAnd(new criteriaMale(),new criteriaSingle());
        for (Person x:criteria.meetCriteria(demo)) {
            System.out.println(x.name);
        }
        System.out.println();

    }
}
