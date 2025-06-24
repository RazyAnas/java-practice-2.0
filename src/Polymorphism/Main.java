package Polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie theMovie = new Adventure("Star Wars");
//        theMovie.watchMovie();
//        Movie theMovie = new Comedy("Star Wars");
//        theMovie.watchMovie();
//
//        Movie theMovie = Movie.getMovie("Science Fiction", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Enter Type (A for Adventure, C for Comedy, " + "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
//        Compile time type = what Java is told the thing is.
//        Run time type = what the thing actually is.
//        Java is strict AF at compile time. You need to cast to access runtime features.



    }
}
