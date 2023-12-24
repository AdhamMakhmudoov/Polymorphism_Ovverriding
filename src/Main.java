public class Main {

    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.setName("Dog");
        System.out.println(animal.getName());
        animal.sound();

        System.out.println();

        Animal animal1 = new Duck();
        animal1.setName("Duck");
        System.out.println(animal1.getName());
        animal1.sound();

        System.out.println();

        Animal animal2 = new Cat();
        animal2.setName("Cat");
        System.out.println(animal2.getName());
        animal2.sound();
    }
}
