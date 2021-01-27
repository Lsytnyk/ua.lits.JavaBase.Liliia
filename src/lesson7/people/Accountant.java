package lesson7.people;

import lesson7.People;

public class Accountant implements People {
    @Override
    public String getPosition(){
        return "accountant";
    }

    public void income(int visitorsCount){
        int income = visitorsCount*100;
        System.out.println("Today income is "+income +" hryvna");

    }
}
