package lesson4;

public class DivisionOfRemainder {

    double divisionOfRemainder(int a, int b) {
        double c = a;
        double d = b;
        double result = c % d;
        System.out.println(a + " % " + b + " = " + result);
        return result;
    }
}
