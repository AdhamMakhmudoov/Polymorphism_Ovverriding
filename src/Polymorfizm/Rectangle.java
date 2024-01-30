package Polymorfizm;


    public class Rectangle extends GeometricFigure {

        public void area() {
            int yuza = getSideA()*getSideB();
            System.out.println("Rectangle area = "+yuza);
        }

        public void perimetr(){
            int peremetr = getSideA()+getSideB();
            System.out.println("Rectangle perimetr = "+peremetr);
        }

        private int sideA;
        private int sideB;

        public Rectangle(int sideA, int sideB) {
            this.sideA = sideA;
            this.sideB = sideB;
        }

        public int getSideA() {
            return sideA;
        }

        public void setSideA(int sideA) {this.sideA = sideA;}

        public int getSideB() {return sideB;}

        public void setSideB(int sideB) {this.sideB = sideB;}
    }

