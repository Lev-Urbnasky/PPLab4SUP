/**
<<<<<<< Updated upstream
 * Created by ��� on 03.06.2015.
=======
 * Created by Лев on 03.06.2015.
>>>>>>> Stashed changes
 */
public class Area {
    private double X;
    private double Y;
    private double Z;

    public Area(double X, double Y, double Z) {
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }



    public double getSphereArea() {
        return X * Y * Z;
    }


    public double getParelpArea() {
        return X * Y * Z;
    }


    public double getSquareArea() {
        return X * Y * Z;
    }

    public static void main(String[] args) {
        Area area = new Area(11.4, 18.6, 16.7);
        System.out.println(area.getSquareArea());
    }
}
