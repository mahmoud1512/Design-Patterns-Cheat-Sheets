public class Demo {

    public static void main(String[] args) {
        Factory factory=new Factory();
        Shape shape1= factory.getShape("Circle");
        shape1.draw();
        Shape shape2=factory.getShape("Rectangle");
        shape2.draw();
        Shape shape3=factory.getShape("Triangle");
        shape3.draw();
    }
}
