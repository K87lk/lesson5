import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Product> products = new HashMap<>();

        Product product1 =  new Product("Cucumber", "SPB", 140);
        Product product2 =  new Product("Potato", "MSK", 340);
        Product product3 =  new Product("Tomato", "BLG", 123);
        Product product4 =  new Product("Apple juice. 1L", "KHV", 34);
        Product product5 =  new Product("Ice-cream", "KZN", 2);
        Product product6 =  new Product("Tomato", "UZB", 45);
        Product product7 =  new Product("Coffee. 200g", "IND", 2);

        products.put(1, product1);
        products.put(2, product2);
        products.put(3, product3);
        products.put(4, product4);
        products.put(5, product5);
        products.put(6, product6);
        products.put(7, product7);

        List<Integer> keyList = products
                .entrySet()
                .stream()
                .filter(e -> e.getValue().getQuantity() > 5)
                .map(e -> e.getKey())
                .collect(Collectors.toList());

        System.out.println("Key list: " + keyList);

        System.out.println("Products with quantity more than 5 :");

        for(Map.Entry<Integer, Product> entry : products.entrySet()) {
                if (entry.getValue().getQuantity() > 5) {
                    System.out.print(entry.getKey() + " ");
                }
            }

        System.out.println("\n" + "Quantity after updating: ");

        updateQuantity(products, keyList);


        }
    public static void updateQuantity(Map<Integer, Product> products, List<Integer> keyList) {
        for (int key : keyList) {
            Product product = products.get(key);
            if (product != null) {
                int currentQuantity = product.getQuantity();
                product.setQuantity(currentQuantity + 10);
            }
        }
        System.out.println(products.entrySet());
    }
}



