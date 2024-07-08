import java.lang.reflect.Type;

public class Factory {

    public Shape getShape(String type)
    {
        if(type.equals("Circle"))
            return new Circle();
        else if (type.equals("Rectangle")) {
            return new Rectangle();
        }
        else if (type.equals("Triangle")) {
               return new Triangle();
        }
        return null;
    }
}
