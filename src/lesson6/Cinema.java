package lesson6;

import java.util.*;

public class Cinema {
    ArrayList<Movie> movieList;
    Cinema(){
        movieList = new ArrayList<Movie>();
    }
    void AddMovie(Movie movie){
        movieList.add(movie);
    }

    Movie FindMovie(String title){
        for (int i = 0; i < movieList.size(); i++) {
            if(movieList.get(i).getTitle().equals(title))
                return movieList.get(i);
        }
        return null;
    }

    void ListMovie(){
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println(movieList.get(i).getTitle());
        }
    }
}

