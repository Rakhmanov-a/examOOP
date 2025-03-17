package film;

import java.time.LocalDate;

public class Movie {
    private Long id;
    private String name;
    private String director;
    private String country;
    private LocalDate releaseDate;
    private Genre genre;

    public Movie(){}
    public Movie(Long id, String name, String director, String country, LocalDate releaseDate, Genre genre) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.country = country;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", country='" + country + '\'' +
                ", releaseDate=" + releaseDate +
                ", genre=" + genre +
                '}';
    }
}
