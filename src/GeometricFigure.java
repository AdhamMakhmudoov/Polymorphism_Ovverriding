public class GeometricFigure {

    public void area(){
        System.out.println("Geometrik Figure area");
    }

    public void perimetr(){
        System.out.println("Geometrik Figure perimetr");
    }

    public static void main(String[] args) {


        GeometricFigure geometricFigure = new GeometricFigure();
        geometricFigure.area();
        geometricFigure.perimetr();

        System.out.println();

        GeometricFigure geometricFigure1 = new Triangle();
        geometricFigure1.area();
        geometricFigure1.perimetr();

        System.out.println();

        GeometricFigure geometricFigure2 = new Trapezium();
        geometricFigure2.area();
        geometricFigure2.perimetr();

        System.out.println();

        GeometricFigure geometricFigure3 = new GeometricFigure();
        geometricFigure3.area();
        geometricFigure3.perimetr();
    }
}
