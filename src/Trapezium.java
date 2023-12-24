public class Trapezium extends GeometricFigure{

    public void area() {
        System.out.println("Trapezium area");
    }

    public void perimetr(){
        System.out.println("Trapezium perimetr");
    }

    private int sideA;

    private int sideB;

    private int high;

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {this.sideA = sideA;}

    public int getSideB() {return sideB;}

    public void setSideB(int sideB) {this.sideB = sideB;}

    public int getHigh() {return high;}

    public void setHigh(int high) {this.high = high;}
}
