public class Demo {
    public static void main(String[] args) {
        int [][]points={{1,2},{2,3},{3,4},{4,5}};
        int width=3;
        int height=7;    //not a true shape

        Painting painting=new Painting(points,width,height);
        Painting cloned=painting.clone();
        painting.points[0][1]=333;
        System.out.println(painting.points[0][1]);//333
        System.out.println(cloned.points[0][1]);  //2
    }
}
