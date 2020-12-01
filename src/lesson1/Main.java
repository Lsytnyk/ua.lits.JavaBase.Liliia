package lesson1;

public class Main {

    public static void main(String[] args) {
	// task one

        int a= 2;
        int b = 4;
        int c = 6;

        int math1 = a+b-c*b;
        int math2 = (a+1)*(c-1)/b+c;
        int math3 = b+c+1*a/b+1;
        int math4 = a-12+b*2-c+1;

        System.out.println(math1);
        System.out.println(math2);
        System.out.println(math3);
        System.out.println(math4);


        //task two
        System.out.println("Task #2:");
        System.out.println("2+2*2 = 6");
        System.out.println("(2+2)2 = 8");
        System.out.println("10"+ "-"+ "2"+ "*"+ "2"+ "="+ "6");
        System.out.println("12"+"+"+"12"+"-"+"4"+"*"+"2"+" ="+" 16");

        //task three
        char unicode1 = '\u0023';
        char unicode2 = '\u0076';
        char unicode3 = '\u0101';
        char unicode4 = '\u0011';

        System.out.println("Task #3:");
        System.out.println(unicode1);
        System.out.println(unicode2);
        System.out.println(unicode3);
        System.out.println(unicode4);

    }
}
