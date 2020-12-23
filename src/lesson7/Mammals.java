package lesson7;

abstract public class Mammals {

    String name;
    int age;
    public boolean predator;


    public Mammals(){};
    public Mammals (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public boolean isPredator(){
        return predator;
    }

    public  void warning(){};
    public void feed(){};
}
