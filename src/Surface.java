/**
 * Created by gsom95 on 03/06/15.
 */
public class Surface {

    public static double  getFigSurface (GeomFigure figure) {
        switch (figure.whatType()) {
            case SPHERE:
                return 4 * Math.PI * Math.pow(figure.getLength(), 2);
            case CONE:
                return 3.14 * figure.getLength() * figure.getHeigth();
            case PARALP:
                return 2 * (figure.getLength() * figure.getWidth()) +
                        2 * (figure.getLength() * figure.getHeigth()) +
                        2 * (figure.getWidth() * figure.getHeigth());
            default:
                return 0;
        }
    }
}
