package Inheritance;

public class Polymorphism {
    public static void main(String[] args) {
        BlockchainStudent obj = new BlockchainStudent();
        // obj.age = 23;
        // obj.name = "Karma";
        // obj.introduce();
        // System.out.println(obj.name);
        obj.study("BLockcahin");
    }
}

class Student{
    String name;
    int age;

    void introduce(){
        System.out.println("Name:" +name+ " " + "Age:"+ age);
    }
}
class BlockchainStudent extends Student{
    String tech= "Etherum";

    void introduce(){
        System.out.println("Name:" +name+ " " + "Age:"+ age + "Technology:" + tech);
    }
    void study(){
        System.out.println("Studying............");
    }
    void study(String course){
        System.out.println("studying:"+" "+ course);
    }
     void study(int dob){
        System.out.println("studying:"+" "+ dob);
    }
}
