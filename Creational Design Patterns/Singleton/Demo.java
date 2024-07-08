public class Demo {

    public static void main(String[] args) {
        Master master=Master.getInstance();
        master=Master.getInstance();
        master=Master.getInstance();
        //no matter how many times I try to provoke the getInstance(); method only one call to constructor will be made
    }
}
