import java.util.*;

public class Constructor{

    public static void main(String[] args){

        Rectangle r1= new Rectangle(5);
        Rectangle r2 = new Rectangle(5,10);

        System.out.println("Area of r1 : "+r1.getArea()+", area of r2 :"+r2.getArea());
    }
}

class Rectangle{
    int length;
    int breadth;

    Rectangle(int l){
        this.length=l;
        this.breadth=l;
    }

    Rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }

    int getArea(){
        return this.length*this.breadth;
    }

    
}