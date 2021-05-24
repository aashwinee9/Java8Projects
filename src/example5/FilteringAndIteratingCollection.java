package example5;

import example4.Product;

import java.util.ArrayList;
import java.util.List;

public class FilteringAndIteratingCollection {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();

        //Adding Products
        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenovo Laptop",28000f));
        productList.add(new Product(4, "Sony Laptop",28000f));
        productList.add(new Product(5, "Apple Laptop", 90000f));

        //This is more compact approach for filtering data
        productList.stream().filter(product -> product.getPrice() == 28000)
                .forEach(product -> System.out.println(product.getPrice()));
    }
}
