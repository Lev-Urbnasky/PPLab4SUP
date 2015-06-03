/**
 * Created by gsom95 on 03/06/15.
 */
public class GeomFigure {

    private GeomFigType gft;

    private double length;
    private double width;
    private double heigth;

    public GeomFigure(GeomFigType _geomFigType) {
        switch (_geomFigType) {
            case CIRCLE: gft = _geomFigType;
                break;
            case TRIANGLE:  gft = _geomFigType;
                break;
            case RECTANGLE: gft = _geomFigType;
                break;
            case PYRAMIDE:  gft = _geomFigType;
                break;
            case PARALP:    gft = _geomFigType;
                break;
            case CONE:      gft = _geomFigType;
                break;
            case SPHERE:    gft = _geomFigType;
                break;
        }
    }

    public void whatType()  {
        System.out.println(this.gft.toString());
    }

    public static void main (String[] args) {
        GeomFigure fig1 = new GeomFigure(GeomFigType.CONE);
        fig1.whatType();
    }
}
