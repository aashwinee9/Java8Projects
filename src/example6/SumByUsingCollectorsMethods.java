package example6;

import example4.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SumByUsingCollectorsMethods {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        //Adding Products
        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "HP Laptop", 30000f));
        productList.add(new Product(3, "HP Laptop", 28000f));
        productList.add(new Product(4, "HP Laptop", 28000f));
        productList.add(new Product(5, "HP Laptop", 90000f));

        //Using Collector's method to sum the prices.
        double totalPrice3 = productList.stream()
                .collect(Collectors.summingDouble(product -> product.getPrice()));
        System.out.println(totalPrice3);


    }
}
