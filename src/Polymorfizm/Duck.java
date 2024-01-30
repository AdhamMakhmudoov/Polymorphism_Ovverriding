package Polymorfizm;

public class Duck extends Animal {

    public Duck(String name) {
        super(name);
    }

    public void sound(){
        System.out.println("Qwek qwek");
    }

}
