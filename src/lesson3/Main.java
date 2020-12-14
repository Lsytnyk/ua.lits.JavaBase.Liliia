package lesson3;

public class Main {

    public static void main(String[] args) {
	// task one


        if (Palindrom.isPalindrom("onnko")) {
            System.out.println("polindrom");

        }
        else{
            System.out.println("not polindrome");
        }

        //task#2
/*       Random r = new Random();
        int[] a = new int[20];
        for (int j=0; j<20; j++) {
            a[j] = r.nextInt(47);
            System.out.print(a[j]+" ");
        }
        System.out.println(" ");
        int biggest = a[0];
        int smallest = a[0];

        for (int j=1; j<20; j++) {

            //find biggest number
            if (biggest<a[j]){
                biggest = a[j];
            }

            //find smallest number
            if (smallest>a[j]){
                smallest=a[j];
            }


            //find odd numbers
            if (a[j]%2!=0){
                System.out.print(a[j]+" ");
            }
        }
        System.out.println(" ");
        System.out.println("Biggest " + biggest);
        System.out.println("Smallest " + smallest);

        for (int k=a.length-1; k>=0; k--){

            System.out.print(a[k]+" ");
        }
        System.out.println(" ");
        //for array sorting
        Arrays.sort(a);
        System.out.print(Arrays.toString(a));
        System.out.println(" ");

    }
*/
        //task3
        //Random r = new Random();
        //int[] a = new int[20];
        int[][] a = {
                {1, 5, 7, 32, 65, 5, 23, 45, 75, 1},
                {33, 44, 12, 32, 4, 5, 12, 3, 4, 1},
                {99, 2, 4, 21, 35, 67, 86, 32, 2, 4},
                {12, 43, 54, 22, 6, 774, 2, 2, 4, 1},
                {12, 34, 12, 2, 0, 12, 40, 42, 12, 3},
                {55, 34, 52, 61, 71, 863, 46, 87, 34, 1},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
                {99, 32, 6, 8, 3, 236, 78, 568, 54, 23},
                {1, 3, 5, 7, 9, 11, 12, 13, 15, 17},
        };

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= a[i].length-1-i; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }


        //task four

       WasBorn newBorn = new WasBorn();
       newBorn.isWasBorn(2);

    }
}
