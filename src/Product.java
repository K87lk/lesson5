import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Product {
    private String title;
    private String producer;
    private Integer quantity;

    public Product(String title, String producer, Integer quantity) {
        this.title = title;
        this.producer = producer;
        this.quantity = quantity;
    }
    public Product() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("title='").append(title).append('\'');
        sb.append(", producer='").append(producer).append('\'');
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }

    public static Map<Integer, Product> getProducts() {
        Map<Integer, Product> products = new HashMap<>();
        products.put(1, new Product("Cucumber", "SPB", 140));
        products.put(2, new Product("Potato", "MSK", 340));
        products.put(3, new Product("Tomato", "BLG", 123));
        products.put(4, new Product("Apple juice. 1L", "KHV", 34));
        products.put(5, new Product("Ice-cream", "KZN", 2));
        products.put(6, new Product("Tomato", "UZB", 45));
        products.put(7, new Product("Coffee. 200g", "IND", 2));
        return products;
    }

}
