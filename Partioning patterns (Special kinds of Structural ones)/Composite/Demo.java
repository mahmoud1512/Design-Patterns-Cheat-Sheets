public class Demo {

    public static void main(String[] args) {
        Soldier soldier1=new Soldier("1");
        Soldier soldier2=new Soldier("2");
        Soldier soldier3=new Soldier("3");
        Soldier soldier4=new Soldier("4");
        Soldier soldier5=new Soldier("5");
        Soldier soldier6=new Soldier("6");
        Officer officerA=new Officer("A");
        Officer officerB=new Officer("B");
        General general=new General("Army commander");
        general.officers.add(officerA);
        general.officers.add(officerB);
        officerA.soldiers.add(soldier1); officerA.soldiers.add(soldier2);officerA.soldiers.add(soldier3);
        officerB.soldiers.add(soldier4); officerB.soldiers.add(soldier5);officerB.soldiers.add(soldier6);
        general.sayHello();

    }
}
