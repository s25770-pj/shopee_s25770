package pjwstk.Shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {
private ShopService shopService;
public ShopApplication(ShopService shopService)
{
	this.shopService = shopService;
}

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}

}
