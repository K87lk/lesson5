import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       Map<Integer, Product> products = Product.getProducts();
       List<Product> productList = products
               .values()
               .stream()
               .filter(e -> e.getQuantity() > 5)
               .toList();
        System.out.println(productList);

        increment(products);


    }
    public static void increment(Map<Integer, Product> products) {
        for(Map.Entry<Integer, Product> product: products.entrySet()) {
                  int increment = product.getValue().getQuantity() + 10;
                  product.getValue().setQuantity(increment);
            }
        System.out.println(products);
    }
}


