public class Client {
    String name;
    Computer computer;

    public Client(String name) {
        this.name = name;
    }
    public void setComputer(Computer computer)
    {
        this.computer=computer;
    }
    public Computer leaveComputer()
    {
        return computer;
    }
}
