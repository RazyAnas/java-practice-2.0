package Polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NextMain {
    public static void main(String[] args) {
//        Movie movie = Movie.getMovie("A", "Sherlock Holmes");

//
//        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
//        jaws.watchMovie();
//        Object comedy = Movie.getMovie("C", "Jaws");
//        Comedy comedyMovie = (Comedy) comedy;
//        comedyMovie.watchComedy();
//
//        var airplane = Movie.getMovie("C", "Joker");
//        airplane.watchMovie();
//
//        var plane = new Comedy("Airplane");
//        plane.watchComedy();

        // testing the runtime type using the instance of operator
        Object unknowObject = Movie.getMovie("S", "Science DNA");
        if (unknowObject.getClass().getSimpleName().equals("Comedy")){
            Comedy c = (Comedy) unknowObject;
            c.watchComedy();
        } else if (unknowObject instanceof Adventure) {
            ((Adventure) unknowObject).watchAdventure();
        } else if (unknowObject instanceof  ScienceFiction syfy) {
            syfy.watchScienceFiction();
            
        }
    }
}
