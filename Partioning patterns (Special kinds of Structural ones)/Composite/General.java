import java.util.ArrayList;
import java.util.List;

public class General extends armyWorker {
    List<Officer>officers=new ArrayList<>();

    public General(String name) {
        this.name = name;
    }

    @Override
    void sayHello() {
        System.out.println("hello I am general " +name);
        for (Officer x:officers) {
            x.sayHello();
        }
    }
}
