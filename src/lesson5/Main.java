package lesson5;
import lesson5.encapsulation.Author;
import lesson5.inheritance.Crew;
import lesson5.inheritance.LaunchSite;
import lesson5.inheritance.Mission;
import lesson5.inheritance.SpaseX;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SpaseX spaseX = new SpaseX("Chester Bloom", "Mexico", "Mars");
        Mission mission = new Mission("Chester Bloom", "Mexico", "Mars", true);
        mission.isCrew();
        Crew crew = new Crew("Chester Bloom", "Mexico", "Mars", true, 5);
        LaunchSite launchSite = new LaunchSite("Chester Bloom", "Mexico", "Mars", "Mexico site best for Mas mission");

        Author author = new Author("Liliia Kiselova");

        // final classes in JDK
    /*    java.lang.String
        java.lang.Integer
        java.lang.Byte*/

        //Additional HW
        Random r = new Random();
        int[] a = new int[100];
        int evenSum = 0;
        int oddSum = 0;

        for (int j=0; j<100; j++) {
            a[j] = r.nextInt(147);
            //System.out.print(a[j]+" ");

            if (a[j]%2==0&&a[j]%3==0&&a[j]%5==0){
                System.out.print(a[j]+ " , ");
            }

            if (a[j] % 2 == 0) {
                evenSum += a[j];
            } else {
                oddSum += a[j];
            }

        }
        System.out.println(" ");
        System.out.println("even sum: " + evenSum);
        System.out.println("odd sum: " + oddSum);




    }
}
