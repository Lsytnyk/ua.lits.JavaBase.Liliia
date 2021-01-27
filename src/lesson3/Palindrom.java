package lesson3;

public class Palindrom {


    public static boolean isPalindrom(String word) {

        int length = word.length();
        int j = length/2;
        boolean flag = true;

        for(int i=0; i<j;i++){
            int k = length-1-i;
            if (word.charAt(i) != word.charAt(k)){
                flag=false;
                break;
            }

        }

        return flag;
    }
}
