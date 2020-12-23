package lesson7;

import lesson7.mammals.Lion;
import lesson7.mammals.Zebra;
import lesson7.people.Accountant;
import lesson7.people.Cleaner;
import lesson7.people.Visitor;
import lesson7.people.Worker;

public class Zoo {
    public static void main(String[] args) {
        int i = 0;
        Mammals lion1 = new Lion("Timon", 1);
        Mammals lion2 = new Lion("Pumba", 2);
        Mammals zebra = new Zebra("Chester", 7);

        System.out.println(DayPart.Morning);
        Visitor visitor1 = new Visitor();
        Visitor visitor2 = new Visitor();
        Visitor visitor3 = new Visitor();
        Visitor visitor4 = new Visitor();
        visitor1.enter();
        i++;
        visitor2.enter();
        i++;
        visitor3.enter();
        i++;
        visitor4.enter();
        i++;

        Worker worker = new Worker();
        System.out.print(worker.getPosition() + " ");
        worker.feed(zebra);
        Cleaner cleaner = new Cleaner();
        cleaner.clean(lion1);

        System.out.println(DayPart.Afternoon);
        Visitor visitor5 = new Visitor();
        Visitor visitor6 = new Visitor();
        visitor5.enter();
        i++;
        visitor6.enter();
        i++;
        visitor1.watch(lion1);
        worker.feed(lion1);
        cleaner.clean(zebra);

        System.out.println(DayPart.Evening);
        visitor1.exit();
        visitor2.exit();
        visitor3.exit();
        visitor4.exit();
        visitor5.exit();
        visitor6.exit();

        worker.feed(lion2);
        cleaner.clean(lion2);
        Accountant accountant = new Accountant();
        accountant.income(i);
    }
}
