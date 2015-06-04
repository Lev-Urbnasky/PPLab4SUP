import java.util.Scanner;

public class AppClass {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        int choice = 0;
        GeomFigure figure = new GeomFigure(GeomFigType.UNDEF);

        System.out.println("Программа для подсчета площади поверхности/площади/периметра разных геометрических фигур.");
        System.out.println("Выберите фигуру:\n");
        System.out.println("1. Сфера");
        System.out.println("2. Конус");
        System.out.println("3. Параллелепипед");
        System.out.println("4. Прямоугольник");
        System.out.println("5. Круг");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                figure.setGFType(GeomFigType.SPHERE);
                break;
            case 2:
                figure.setGFType(GeomFigType.CONE);
                break;
            case 3:
                figure.setGFType(GeomFigType.PARALP);
                break;
            case 4:
                figure.setGFType(GeomFigType.RECTANGLE);
                break;
            case 5:
                figure.setGFType(GeomFigType.CIRCLE);
                break;
            default:
                System.out.println("Не правильно введен номер.");
                break;
        }

        switch (figure.whatType()) {
            case SPHERE:
                System.out.print("Введите радиус сферы: ");
                figure.setLength(scanner.nextDouble());
                System.out.println("Площадь поверхности: " + Surface.getFigSurface(figure));
                break;
            case CONE:
                System.out.print("Введите радиус основания конуса: ");
                figure.setLength(scanner.nextDouble());
                System.out.print("Введите высоту конуса: ");
                figure.setHeigth(scanner.nextDouble());
                System.out.println("Площадь поверхности: " + Surface.getFigSurface(figure));
                break;
            case PARALP:
                System.out.print("Введите длину: ");
                figure.setLength(scanner.nextDouble());
                System.out.print("Введите ширину: ");
                figure.setWidth(scanner.nextDouble());
                System.out.print("Введите высоту: ");
                figure.setHeigth(scanner.nextDouble());
                System.out.println("Площадь поверхности: " + Surface.getFigSurface(figure));
                /* TODO для периметра */
                //System.out.println("Периметр: " + ...);
                break;
            case RECTANGLE:
                System.out.print("Введите длину: ");
                figure.setLength(scanner.nextDouble());
                System.out.print("Введите ширину: ");
                figure.setWidth(scanner.nextDouble());
                /* TODO для периметра и площади */
                //System.out.println("Периметр: " + ...);
                //System.out.println("Площадь: " + ...);
                break;
            case CIRCLE:
                System.out.print("Введите радиус круга: ");
                figure.setLength(scanner.nextDouble());
                /* TODO для периметра (длины окружности)  и площади */
                //System.out.println("Периметр: " + ...);
                //System.out.println("Площадь: " + ...);
                break;
        }

    }
}
