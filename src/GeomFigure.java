/**
 *    PPLab4SUP
 *    Created by Sapozhnikov, Urbansky, Panjushev
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
            case RECTANGLE: gft = _geomFigType;
                break;
            case PARALP:    gft = _geomFigType;
                break;
            case CONE:      gft = _geomFigType;
                break;
            case SPHERE:    gft = _geomFigType;
                break;
            default:        gft = GeomFigType.UNDEF;
                break;
        }

    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public GeomFigType whatType()  {
        return this.gft;
    }

    public void setGFType(GeomFigType gft) { this.gft = gft;}
}
