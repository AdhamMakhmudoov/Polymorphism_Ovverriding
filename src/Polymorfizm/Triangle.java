package Polymorfizm;


public class Triangle extends GeometricFigure {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public void perimetr() {
        int perimetri = getSideA() + getSideB() + getSideC();
        System.out.println("Triangle perimetr = " + perimetri);
    }

    public void area() {
        int s = (getSideA() + getSideB() + getSideC()) / 2;
        double yuzi = Math.sqrt(s * (s - getSideA()) * (s - getSideB()) * (s - getSideC()));
        System.out.println("Triangle area = " + yuzi);
    }
}
