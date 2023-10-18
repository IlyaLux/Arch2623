package Ports;

import Domain.MovieReview;

import java.util.List;

public interface iPrintMovieReviews {
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}
