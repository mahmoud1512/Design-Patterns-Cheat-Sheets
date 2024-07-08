public class Master {
    private static Master master;
    private static int number=1;
    private Master() {
        System.out.println("hello I am master number "+ number);
    }
    public static synchronized Master getInstance()
    {
        if(master==null) {
            master = new Master();
        }
        return master;
    }
}

