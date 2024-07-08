public class Demo {
    public static void main(String[] args) {
        FactoryProducer producer=new FactoryProducer();
        AbstractFactory factory=producer.getFactory(true);
        Shape shape1= factory.getShape("Square");
        shape1.draw();
        factory=producer.getFactory(false);
        Shape shape2=factory.getShape("Rectangle");
        shape2.draw();
    }
}
