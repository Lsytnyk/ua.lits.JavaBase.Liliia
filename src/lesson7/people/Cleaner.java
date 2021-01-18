package lesson7.people;

import lesson7.Mammals;
import lesson7.People;

public class Cleaner implements People {
    @Override
    public String getPosition() {
        return "cleaner";
    }

    public void clean(Mammals animal){
        System.out.println("cleaning " + animal.getName()+ "'s cage");
    }
}
