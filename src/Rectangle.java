public class Rectangle extends GeometricFigure{

    public void area() {
        System.out.println("Rectangle area");
    }

    public void perimetr(){
        System.out.println("Rectangle perimetr");
    }

    private int sideA;
    private int sideB;

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {this.sideA = sideA;}

    public int getSideB() {return sideB;}

    public void setSideB(int sideB) {this.sideB = sideB;}
}
