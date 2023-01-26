package pjwstk.Shop;

import org.springframework.stereotype.Component;

@Component
public class ShopService {

    private Cart cart;
    private ShopStorage shopStorage;

    public ShopService(ShopStorage shopStorage) {
        this.shopStorage = shopStorage;
    }

    public Transaction orderItems(Cart cart) {
        double cartPrice = 0;
        double client = cart.getClient().getBalance();
        for (String product : cart.getProducts()) {
            cartPrice += shopStorage.findProductByName(product).getPrice();
        }
        if (cartPrice <= cart.getClient().getBalance() ) {
            cart.getClient().setBalance(client - cartPrice);
            return new Transaction(cart.getClient().getBalance(), "ACCEPTED");
        } else {
            return new Transaction(cart.getClient().getBalance(), "DENIED");
        }
    }

    public ShopStorage getShopStorage() {
        return shopStorage;
    }
}