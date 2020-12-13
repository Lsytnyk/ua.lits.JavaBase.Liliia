package lesson4;

public class Main {
    public static void main(String[] args){


        Sum myCalc = new Sum();
        Subtraction mySub = new Subtraction();
        Multiplication myMulti = new Multiplication();
        Division myDivision = new Division();
        DivisionOfRemainder myDivRemainder = new DivisionOfRemainder();

        int a = 21;
        int b = 11;

        int sum = myCalc.sum(a,b);
        int substraction = mySub.subtraction(a,b);
        int multiplication = myMulti.multiplication(a,b);
        double division = myDivision.division(a,b);
        double divisionOfRemainder = myDivRemainder.divisionOfRemainder(a,b);
        sum = myCalc.sum(sum, a);
        double n = myCalc.sum(a,myCalc.sum(a,a));

        //System.out.println(sum.sum1);
    }
}
