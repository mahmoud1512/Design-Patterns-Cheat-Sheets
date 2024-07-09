import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    //we will enforce 3 instances
    public static void main(String[] args) {
        Computer computer1=new Computer("");
        Computer computer2=new Computer("");
        Computer computer3=new Computer("");
        List<Computer>list=new ArrayList<>(Arrays.asList(computer1,computer2,computer3));
        computerPool pool=new computerPool(list);
        Client client1=new Client("C1");
        Client client2=new Client("C2");
        Client client3=new Client("C3");
        Client client4=new Client("C4");
        client1.setComputer(pool.acquire(client1.name));
        System.out.println(client1.computer.user);

        client2.setComputer(pool.acquire(client2.name));
        System.out.println(client2.computer.user);

        client3.setComputer(pool.acquire(client3.name));
        System.out.println(client3.computer.user);

       // client4.setComputer(pool.acquire(client4.name));
        //System.out.println(client4.computer.user);  // will create null pointer exception

        pool.release(client3.leaveComputer());

        client4.setComputer(pool.acquire(client4.name));
        System.out.println(client4.computer.user);  // will not create null pointer exception


    }
}
