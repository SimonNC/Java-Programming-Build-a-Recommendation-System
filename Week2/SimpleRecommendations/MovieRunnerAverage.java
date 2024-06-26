
/**
 * Décrivez votre classe MovieRunnerAverage ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
import java.util.*;
public class MovieRunnerAverage {
    
    public void printAverageRatings(){
        SecondRatings secondRatings = new SecondRatings("ratedmoviesfull", "ratings");
        //SecondRatings secondRatings = new SecondRatings("ratedmovies_short", "ratings_short");
        System.out.println("Total number of movies : " + secondRatings.getMovieSize());
        System.out.println("Total number of raters : " + secondRatings.getRaterSize());
        int MinNumOfRatings = 12; // variable
        ArrayList<Rating> averageRatings = secondRatings.getAverageRatings(MinNumOfRatings);
        Collections.sort(averageRatings);
        for (Rating rating : averageRatings) {
            System.out.println(rating.getValue() + " " + secondRatings.getTitle(rating.getItem()));
        }
        System.out.println("There are " + averageRatings.size() + " movies with " +
        MinNumOfRatings + " or more ratings");
    }
    
    public void getAverageRatingOneMovie () {
        SecondRatings secondRatings = new SecondRatings ("ratedmoviesfull", "ratings");
        //SecondRatings secondRatings = new SecondRatings("ratedmovies_short", "ratings_short");
        
        String title = "Vacation"; // variable
        int MinNumOfRatings = 1; // variable
        
        String movieID = secondRatings.getID(title);
        ArrayList<Rating> averageRatings = secondRatings.getAverageRatings(MinNumOfRatings);
        for (Rating rating : averageRatings) {
            if (rating.getItem().equals(movieID)) {
                System.out.println("For movie \"" + title + "\" the average rating is " 
                + rating.getValue());
            }
        }
    }
    
    

}

