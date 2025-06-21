package PracticeSet8;
import java.util.*;

public class CreatingEmployeeClass {
    
    public static void main(String[] args){
        Employee E1 = new Employee();

        E1.setName("Prakash Chand");
        E1.setSalary(10000);

        System.out.println("Name of employee is : "+ E1.getName()+" and salary of employee is : "+E1.getSalary());
    }

}

class Employee{
    int empSalary;
    String empName;

    void setName(String name){
        empName=name;
    }

    String getName(){
        return empName;
    }

    void setSalary(int salary){
        empSalary=salary;
    }

    int getSalary(){
        return empSalary;
    }
}
