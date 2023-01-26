package pjwstk.Shop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShopStorage {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }
    public Product findProductByName(String name) {
        Product productIfNull = new Product(null,0);
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return productIfNull;
    }
    public List<Product> getAllProducts(){
        return products;
    }
}
