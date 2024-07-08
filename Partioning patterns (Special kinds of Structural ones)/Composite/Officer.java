import java.util.ArrayList;
import java.util.List;

public class Officer extends armyWorker{
    List<Soldier>soldiers=new ArrayList<>();

    public Officer(String name) {
        this.name = name;
    }

    @Override
    void sayHello() {
        System.out.println("hello I am Officer "+ name);
        for (Soldier x:soldiers) {
            x.sayHello();
        }
    }
}
