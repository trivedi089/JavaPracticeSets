import java.util.*;

public class ClassAndInterface {
    
    public static void main(String[] args){

        Human Bittu = new Human();

        Bittu.jump();
        Bittu.bite();
        Bittu.eat();
        Bittu.sleep();
        Bittu.speak();
    }
}

class Monkey{

    void jump(){
       System.out.println( "I can jump 5 fit");
    }

    void bite(){
        System.out.println("Don't bother me otherwise I will bite you");
    }
}

class Human extends Monkey implements BasicAnimal{

    public void eat(){
        System.out.println("Human eats...");
    }

    public void sleep(){
        System.out.println("Humans sleep too much...");
    }

    void speak(){
        System.out.println("Human can Speak...");
    }

}

interface BasicAnimal{

    void eat();
    void sleep();
}