public class Rounded_Shape_Factory extends AbstractFactory{

    @Override
    public Shape getShape(String param) {
        if(param.equals("Square"))
            return new roundedSquare();
        else
            return new roundedRectangle();
    }
}
