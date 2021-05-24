package example9;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import example4.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListintoMap {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
       //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 25000f));
        productsList.add(new Product(3, "Lenovo Laptop", 25000f));
        productsList.add(new Product(4, "Sony Laptop", 25000f));
        productsList.add(new Product(5, "Apple Laptop", 25000f));

        //Converting Product List into a Map
        Map<Integer, String> productPriceMap = productsList.stream()
                .collect(Collectors.toMap(p -> p.getId(), p->p.getName()));
        System.out.println(productPriceMap);

    }
}
