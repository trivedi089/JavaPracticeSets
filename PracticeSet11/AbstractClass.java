import java.util.*;

public class AbstractClass{

    public static void main(String[] args){

    
    Pencil p1 = new Pencil();
    p1.colour="Black";

    p1.write();
    p1.refill();



    }
}

abstract class Pen{

    String colour;

    abstract void write();

    abstract void refill();

}

class Pencil extends Pen{

    void write(){
        System.out.println("This pencil writes very smoothly");
    }

    void refill(){
        System.out.println("Need to change it");
    }

}