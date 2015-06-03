/**

 * Created by Лев on 03.06.2015.

 */
public class Area {
    private double X;
    private double Y;
    private double radius;
    public enum GeomFigType {RECTANGLE, CIRCLE};
    public Area(double X, double Y, double radius) {
        switch (GeomFigType){
            case RECTANGLE:
                this.X = X;
                this.Y = Y;
                break;
            case CIRCLE:
                this.radius = radius;
                break;
        }

    }



    public double getArea() {
        switch (GeomFigType){
            case RECTANGLE:
               return X * Y;
                break;
            case CIRCLE:
               return Math.PI * radius * radius;
                break;
            default:
                System.out.println("У данной фигуры площадь не считается");
        }
        return 0;
    }



    public static void main(String[] args) {
        Area area = new Area(11.4, 18.6, 16.7);
        System.out.println(area.getArea());
    }
}
