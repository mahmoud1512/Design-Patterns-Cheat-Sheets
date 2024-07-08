public class ShapeFactory extends AbstractFactory{


    @Override
    public Shape getShape(String param) {
          if(param.equals("Square"))
              return new Square();
          else
              return new Rectangle();
    }
}
