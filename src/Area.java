/**

 * Created by Лев on 03.06.2015.

 */
public class Area {


    public double getArea(GeomFigure figure) {
        switch(figure.whatType()){
            case RECTANGLE:   return figure.getHeigth() * figure.getWidth();
            break;
            case CIRCLE: return Math.PI * figure.getLength() * figure.getLength();
            break;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Area area = new Area(11.4, 18.6, 16.7, CIRCLE);
        System.out.println(area.getArea());
    }
}
