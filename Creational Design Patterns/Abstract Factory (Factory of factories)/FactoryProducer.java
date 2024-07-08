public class FactoryProducer {

    AbstractFactory getFactory(Boolean rounded)
    {
        if(rounded)
            return new Rounded_Shape_Factory();
        else
            return new ShapeFactory();
    }
}
