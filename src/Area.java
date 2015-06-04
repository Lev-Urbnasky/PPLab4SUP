/*
    PPLab4SUP
 */
public class Area {

    public static double  getFigArea (GeomFigure figure) {
        switch (figure.whatType()) {
            case RECTANGLE:
                return figure.getLength() * figure.getWidth();
            case CIRCLE:
                return Math.PI * Math.pow(figure.getLength(), 2);
            default:
                return 0;
        }
    }
}
