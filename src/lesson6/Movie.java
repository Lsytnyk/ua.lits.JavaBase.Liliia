package lesson6;

import java.io.Console;
import java.util.logging.XMLFormatter;

public class Movie {

    String title;
    boolean [][] places;
    int rows;
    int seats;

    Movie(String movieTitle, int rows, int seats){
        this.title = movieTitle;
        this.rows = rows;
        this.seats = seats;
        places = new boolean[rows][seats];
        for(int i=0; i<rows; i++){
            for (int j = 0; j < seats; j++) {
                places[i][j] = true;
            }
        }
    }

    public String getTitle(){
        return title;
    }

    public boolean ReserveSeat(int row, int seat){
        if(row >= this.rows || seat >= this.seats){
            System.out.println("Row or seat is too big");
            return false;
        }
        if(places[row-1][seat-1]) {
            places[row-1][seat-1] = false;
            return true;
        }
        return false;
    }

    public boolean IsFree(int row, int seat){
        return places[row-1][seat-1];
    }

    public void ShowPlaces(){
        System.out.println("=====Screen=====");
        for (int i = 0; i < rows; i++) {
            System.out.print((i+1) + ": ");
            for (int j = 0; j < seats; j++) {
                System.out.print("[");
                if(places[i][j])
                    System.out.print(j+1);
                else System.out.print("X");
                System.out.print("] ");
            }
            System.out.println("");
        }
    }

}
