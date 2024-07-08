public class Soldier extends armyWorker{

    public Soldier(String name) {
        this.name = name;
    }

    @Override
    void sayHello() {
        System.out.println("I am Soldier "+ name);
    }
}
