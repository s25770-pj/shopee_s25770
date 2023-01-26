package pjwstk.Shop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class ShopServiceMockTest {
    @Mock
    private ShopStorage shopStorage;
    @InjectMocks
    private ShopService shopService;
    @Test
    public void negativeBalance(){
        Client client = new Client("1", -10d);
        Cart cart = new Cart(client);
        assertThat(shopService.orderItems(cart).getStatus()).isEqualTo(new Transaction(0,"DENIED").getStatus());
    }
    @Test
    public void Balance(){
        Client client = new Client("1", 10d);
        Cart cart = new Cart(client);
        Product product = new Product("ball", 15);
        cart.addProduct("ball");
        when(shopStorage.findProductByName(any())).thenReturn(product);
        assertThat(shopService.orderItems(cart).getStatus()).isEqualTo(new Transaction(0,"DENIED").getStatus());
    }
}
