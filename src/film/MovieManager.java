package film;

import java.util.Arrays;

public class MovieManager {
    private Movie[] movies = new Movie[0];

    public MovieManager(){}
    public MovieManager(Movie[] movies) {
        this.movies = movies;
    }

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "MovieManager{" +
                "movies=" + Arrays.toString(movies) +
                '}';
    }

    public void addMovie(Movie newMovie) {
        movies = Arrays.copyOf(movies, movies.length + 1);
        movies[movies.length - 1] = newMovie;
        System.out.println("Success add! ");

    }

    public void getAllMovies() {
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);
        }
    }

    public Movie getMovieById(Long movieId) {
        boolean isLike = false;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId().equals(movieId)) {
                isLike = true;
                System.out.println(movies[i]);
            }
        }
        if (!isLike) {
            System.out.println("Student with id " + movieId + " not found! ");
        }
        return null;
    }

    public void updateMovieById(Long movieId, Movie newMovie){
        boolean isLike = false;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId().equals(movieId)){
                isLike = true;
                movies[i] = newMovie;
            }
        }
        if (!isLike){
            System.out.println("Student with id " + movieId + " not found! ");
        }
    }
    public void deleteMovie(Long movieId){
        boolean isLike = false;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId().equals(movieId)){
                isLike = true;
                movies[i] = null;
            }

    }

    }
}
