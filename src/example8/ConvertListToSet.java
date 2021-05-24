package example8;

import example4.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListToSet {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();

        //Adding Products
        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "HP Laptop", 30000f));
        productList.add(new Product(3, "HP Laptop", 28000f));
        productList.add(new Product(4, "HP Laptop", 28000f));
        productList.add(new Product(5, "HP Laptop", 90000f));

        //Converting product List into Set
        Set<Float> productPriceList = productList.stream().filter(product -> product.getPrice() < 30000)
                .map(product -> product.getPrice()).collect(Collectors.toSet());
        System.out.println(productPriceList);
    }
}
