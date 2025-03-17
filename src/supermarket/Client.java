package supermarket;

import java.util.Scanner;

public class Client extends Card implements CardInterface{
   private int age;
   private   Basket basket;

    public Client(String firstName, String lastName, int age, Card card, Basket basket) {
        super(card.getFirstName(), card.getLastName(), card.getCardNumber(), card.getBalance(), card.getPassword());
        this.age = age;
        this.basket = basket;
    }

    // Реализация метода payWithCard
    @Override
    public String payWithCard(double money) {
        if (money > 100) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите пароль: ");
            String inputPassword = scanner.nextLine();

            if (!inputPassword.equals(this.getPassword())) {
                return "Неверный пароль!";
            }
        }

        if (this.getBalance() >= money) {
            this.balance -= money;
            return generateReceipt();
        } else {
            return "У вас не хватает средств!";
        }
    }

    // Реализация метода getCardBalance
    @Override
    public double getCardBalance() {
        return this.balance;
    }

    // Генерация чека
    private String generateReceipt() {
        StringBuilder receipt = new StringBuilder();
        receipt.append("Чек:\n");
        for (Product product : basket.getProducts()) {
            receipt.append(product.getProductName()).append(" - ").append(product.getPrice()).append(" сом\n");
        }
        receipt.append("Общая сумма: ").append(basket.getTotalAmount()).append(" сом\n");
        receipt.append("Остаток на карте: ").append(this.balance).append(" сом");
        return receipt.toString();
    }
}
