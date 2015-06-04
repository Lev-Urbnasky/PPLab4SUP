/**
 *    PPLab4SUP
 *    Created by Sapozhnikov, Urbansky, Panjushev
 */

public class perimetr {

    public static double  getFigPerimetr (GeomFigure figure) {
        switch (figure.whatType()) {
            case RECTANGLE:
                return (figure.getLength() + figure.getWidth()) * 2;
            case CIRCLE:
                return 2 * Math.PI * figure.getLength();
            case PARALP:
                return figure.getLength() * 4 +
                        figure.getWidth() * 4 +
                        figure.getHeigth() * 4;
            default:
                return 0;
        }
    }
}