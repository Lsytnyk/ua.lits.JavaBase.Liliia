package lesson7.people;

import lesson7.Mammals;

public class Visitor {

    public void enter(){
        System.out.println("New visitor enter the zoo and pay 100");
    }

    public void watch(Mammals animal){
        if (animal.isPredator()){
            animal.warning();
        }
    }

    public void exit(){
        System.out.println("visitor exit the zoo");
    }
}
