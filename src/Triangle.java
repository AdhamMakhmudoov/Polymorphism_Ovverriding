public class Triangle extends GeometricFigure{

    public void area() {
        System.out.println("Triangle area");
    }

    public void perimetr(){
        System.out.println("Triangle perimetr");
    }

    private int sideA;
    private int sideB;
    private int sideC;

    public int getSideA() {return sideA;}

    public void setSideA(int sideA) {this.sideA = sideA;}

    public int getSideB() {return sideB;}

    public void setSideB(int sideB) {this.sideB = sideB;}

    public int getSideC() {return sideC;}

    public void setSideC(int sideC) {this.sideC = sideC;}
}
