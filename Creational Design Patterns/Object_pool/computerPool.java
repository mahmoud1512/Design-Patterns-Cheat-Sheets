import java.util.ArrayList;
import java.util.List;

public class computerPool {
    private List<Computer>free;
    private List<Computer>Used=new ArrayList<>();

    public computerPool(List<Computer> free) {
        this.free = free;
    }

    public synchronized Computer acquire(String user)
    {
        if(free.isEmpty())
            return null;
        Computer ans=free.remove(0);
        ans.user=user;
        Used.add(ans);
        return ans;
    }
    public synchronized void release(Computer computer)
    {
        computer.reset();
        Used.remove(computer);
        free.add(computer);
    }
}
