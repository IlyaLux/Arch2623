package Adapters;

import Domain.MovieReview;
import Ports.iPrintMovieReviews;
import java.util.List;

public class ConsolePrinter implements iPrintMovieReviews{


    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList){
        movieReviewList.forEach(movieReview -> {
            System.out.println(movieReview.toString());
        });
    }

}
