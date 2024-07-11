import java.util.Arrays;

public class Painting {

      public int[][] points;
      private int width,height;

    public Painting(int[][] points, int width, int height) {
        this.points = points;
        this.width = width;
        this.height = height;
    }

    public Painting() {
    }



    @Override
      public Painting clone()
      {
          Painting newPainting=new Painting();
          newPainting.height=this.height;
          newPainting.width=this.width;
          int rows=points.length;int cols=points[0].length;
          newPainting.points=new int[rows][cols];
          for (int i = 0; i < rows; i++) {
              for (int j = 0; j < cols; j++) {
                  newPainting.points[i][j]=this.points[i][j];
              }
          }
          return newPainting;
      }
}
