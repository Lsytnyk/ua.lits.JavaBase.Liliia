package lesson8;

public class Main {

    public static void main(String[] args) {

        //regexp for email: ^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$
        //regexp for phones:((\+38)?\(?\d{3}\)?[\s\.-]?(\d{7}|\d{3}[\s\.-]\d{2}[\s\.-]\d{2}|\d{3}-\d{4}))

        StringBuilder sb = new StringBuilder("My");
        sb.append(" ");
        sb.append("homework");
        sb.append(" ");
        sb.append("for");
        sb.append(" ");
        sb.append("lesson");
        sb.append(" ");
        sb.append("8");
        System.out.println(sb.toString());

    }
}
