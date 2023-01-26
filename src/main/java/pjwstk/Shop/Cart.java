package pjwstk.Shop;


import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Client client;
    public Cart(Client client)
    {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    List<String> productsInCart = new ArrayList<>();

    public List<String> getProducts(){
        return productsInCart;
    }
    public void addProduct(String product){
        productsInCart.add(product);
    }


}
