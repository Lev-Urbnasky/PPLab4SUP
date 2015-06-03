/**
 * Created by Student on 03.06.2015.
 */

public class perimetr {
    private double P;
    public perimetr() {
        switch (GeomFigType _geomFigType) {
            break;
            case TRIANGLE:
                P = a+b+c;
                break;
            case RECTANGLE:
                P = (a+b)*2;
                break;
            case PARALP:
                P = (a+b)*4+(a+c)*4+(b+c)*4;
                break;
        }

    }
}