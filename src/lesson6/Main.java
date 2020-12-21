package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cinema myCinema = new Cinema();
        myCinema.AddMovie(new Movie("Harry Potter", 5,5));
        myCinema.AddMovie(new Movie("Pacific Rim", 10,16));
        myCinema.AddMovie(new Movie("Mad Max", 3,3));
        myCinema.AddMovie(new Movie("Home Alone", 5,5));

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Cinema. Here is the list of movies we have:");
        myCinema.ListMovie();
        String userInput = "";
        while(!userInput.equals("exit")){
            System.out.println("Please type the name of the movie to reserve ticket,");
            System.out.println("'list' to get list of the movies,");
            System.out.println("'exit' to quit");
            userInput = in.nextLine();
            switch (userInput){
                case "exit" : break;
                case "list" :
                    myCinema.ListMovie();
                    break;
                default:
                    Movie film = myCinema.FindMovie(userInput);
                    if(film != null){
                        boolean booked = false;
                        while(!booked) {
                            System.out.println("Available seats:");
                            film.ShowPlaces();
                            System.out.println("Please enter row:");
                            int rowInput = in.nextInt();
                            System.out.println("Please enter seat:");
                            int seatInput = in.nextInt();
                            if (film.ReserveSeat(rowInput, seatInput)) {
                                System.out.println("Successfully booked row " + rowInput + " seat " + seatInput);
                                booked = true;
                            } else {
                                System.out.println("Already booked. Would you like to select another place? Y/N");
                                String s = in.nextLine();
                                s = in.nextLine();
                                if(s.equals("N") || s.equals("n"))
                                    break;
                            }
                        }
                    }
                    else{
                        System.out.println("Movie " + userInput + " was not found. Please try again.");
                    }
                    break;
            }
        }
    }
}