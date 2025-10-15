import java.util.*;

class Product {
    String name;
    double price, rating, discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " (₹" + price + ", ⭐" + rating + ", " + discount + "% off)";
    }
}

public class ECommerce {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Phone", 30000, 4.5, 10),
            new Product("Laptop", 60000, 4.7, 15),
            new Product("Headphones", 2000, 4.3, 25)
        );
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by Price: " + products);

        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("Sorted by Rating: " + products);

        
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("Sorted by Discount: " + products);
    }
}
