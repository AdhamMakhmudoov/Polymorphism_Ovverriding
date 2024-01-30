package Polymorfizm;

public class Main {
    public static void main (String... args) {

        System.out.println();
        Triangle triangle = new Triangle(5,6,7);
        triangle.area();
        triangle.perimetr();

        System.out.println();

        Trapezium trapezium = new Trapezium(5,6,7);
        trapezium.area();
        trapezium.perimetr();

        System.out.println();

        Rectangle rectangle = new Rectangle(6,8);
        rectangle.area();
        rectangle.perimetr();

        System.out.println();

        Animal cat = new Cat("Cat");
        System.out.println(cat.getName());
        cat.sound();


        Animal dog = new Dog("Dog");
        System.out.println(dog.getName());
        dog.sound();


        Animal duck = new Duck("Duck");
        System.out.println(duck.getName());
        duck.sound();


    }
}
