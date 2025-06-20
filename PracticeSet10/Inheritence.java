import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class Inheritence {

    public static void main(String[] args){

    Circle  c1 = new Circle(5);
    Cylinder cy1 = new Cylinder(10, 10);

    System.out.println("Area of Cirle is : "+ Math.PI* c1.getRadius() * c1.getRadius());

    System.out.println("Volume of Cylinder is : "+ Math.PI* cy1.getRadius()*cy1.getRadius()*cy1.getHeight());
    }
    
}

class Circle{

    int radius;

    Circle(int radius){
        this.radius=radius;
    }

    void setRadius(int radius){
        this.radius=radius;
    }

    int getRadius(){
        return this.radius;
    }
}

class Cylinder extends Circle{

    int height;

    Cylinder(int radius,int height){
        super(radius);
        this.height=height;
    }

    void setHeight(int height){
        this.height = height;
    }

    int getHeight(){
        return this.height;
    }

    
}