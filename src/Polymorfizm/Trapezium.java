package Polymorfizm;


    public class Trapezium extends GeometricFigure {


        private int sideA;

        private int sideB;

        private int high;

        public Trapezium(int sideA, int sideB, int high) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.high = high;
        }

        public int getSideA() {
            return sideA;
        }

        public void setSideA(int sideA) {this.sideA = sideA;}

        public int getSideB() {return sideB;}

        public void setSideB(int sideB) {this.sideB = sideB;}

        public int getHigh() {return high;}

        public void setHigh(int high) {this.high = high;}


        public void area() {
            float yuza =(float) ((getSideA()+getSideB())/2.0)*getHigh();
            System.out.println("Yuzasi = "+yuza);
        }


        public void perimetr() {
            int peremetr = getSideA()+getSideB();
            System.out.println("Peremetri = "+peremetr);
        }
    }

