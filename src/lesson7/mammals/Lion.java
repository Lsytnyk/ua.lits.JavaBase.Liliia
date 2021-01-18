package lesson7.mammals;

import lesson7.Mammals;

public class Lion extends Mammals {

    public Lion (String name, int age){
        super(name, age);
        predator = true;
    }

    @Override
    public void warning(){
        System.out.println("Please don't touch lions cage");
    }

    @Override
    public void feed() {
        System.out.println("sound of bones");
    }
}
