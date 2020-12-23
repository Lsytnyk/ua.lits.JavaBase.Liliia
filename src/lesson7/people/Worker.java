package lesson7.people;

import lesson7.Mammals;
import lesson7.People;

public class Worker implements People {

    @Override
    public String getPosition() {
        return "worker";
    }

    public void feed(Mammals animal){
        if(animal.isPredator()){
            System.out.println("Fed "+animal.getName()+" with meat");

        }
        else {
            System.out.println("Fed "+animal.getName()+" with grass");
        }
        animal.feed();
    }
}
