import film.Genre;
import film.Movie;
import film.MovieManager;
import supermarket.Basket;
import supermarket.Card;
import supermarket.Client;
import supermarket.Product;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        // Создаем карту
//        Card card = new Card("Иван", "Иванов", "1234 5678 9012 3456", 500, "1234");
//
//        // Создаем корзину и добавляем продукты
//        Basket basket = new Basket();
//        basket.addProduct(new Product("Хлеб", 30));
//        basket.addProduct(new Product("Молоко", 50));
//        basket.addProduct(new Product("Яблоки", 100));
//
//        // Создаем клиента
//        Client client = new Client("Иван", "Иванов", 25, card, basket);
//
//        // Оплата
//        double totalAmount = basket.getTotalAmount();
//        System.out.println("Общая сумма покупки: " + totalAmount + " сом");
//        System.out.println(client.payWithCard(totalAmount));

//Movie movie = new Movie(1L,"Джентельмени", "Гай Ричи","Америка", LocalDate.of(2018,3,12), Genre.ACTION);
        MovieManager movieManager = new MovieManager();
        movieManager.addMovie(new Movie(1L,"Джентельмени", "Гай Ричи","Америка", LocalDate.of(2018,3,12), Genre.ACTION));
        movieManager.addMovie(new Movie(2L,"Гнев человеческий", "Гай Ричи","Америка", LocalDate.of(2019,3,12),Genre.DRAMA));
        movieManager.addMovie(new Movie(3L,"Переводчик", "Гай Ричи","Америка", LocalDate.of(2020,3,12), Genre.FANTASY));

        movieManager.getAllMovies();
        System.out.println("------");
        movieManager.updateMovieById(3L,new Movie(3L,"Аяш", "Бакыт Осмонканов","Кыргызстан", LocalDate.of(2017,9,1), Genre.COMEDY));
        movieManager.getAllMovies();
        System.out.println("=======");
        movieManager.deleteMovie(3L);
        movieManager.getAllMovies();
    }
}