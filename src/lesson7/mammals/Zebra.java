package lesson7.mammals;

import lesson7.Mammals;

public class Zebra extends Mammals {

    public Zebra(String name, int age){
        super(name, age);
        predator = false;
    }

    @Override
    public void feed() {
        System.out.println(" khr khr");
    }
}
