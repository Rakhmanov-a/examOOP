package supermarket;

import java.util.Arrays;

public class Basket {
    private Product[] products = new Product[0];


    // Добавление продукта в корзину
    public void addProduct(Product newProduct){
        products = Arrays.copyOf(products,products.length+1);
        products[products.length-1] = newProduct;
        System.out.println("Success add! ");

    }

    // Получение общей суммы корзины
    public double getTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void getAllProduct(){
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    public Product[] getProducts() {
        return products;
    }
}
