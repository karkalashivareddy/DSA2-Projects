```java
import java.util.*;

class Main {

    static class Product {
        int id;
        int price;

        Product(int id, int price) {
            this.id = id;
            this.price = price;
        }
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(101, 12000));
        products.add(new Product(102, 15000));
        products.add(new Product(103, 18000));
        products.add(new Product(104, 22000));
        products.add(new Product(105, 25000));

        System.out.println("Products between 12000 and 22000:");

        for (Product p : products) {
            if (p.price >= 12000 && p.price <= 22000) {
                System.out.println(
                        "Product ID: " + p.id +
                        " Price: " + p.price
                );
            }
        }
    }
}
```

