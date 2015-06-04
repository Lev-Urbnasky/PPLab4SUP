/**

 * Created by Лев on 03.06.2015.

 */
public class Area {

    public static double  getFigArea (GeomFigure figure) {
        switch (figure.whatType()) {
            case RECTANGLE:
                return figure.getHeigth() * figure.getWidth();
            case CIRCLE:
                return Math.PI * Math.pow(figure.getLength(), 2);
            default:
                return 0;
        }
    }
}
