package Store.InventoryService;

import Store.InventoryService.Model.Inventory;
import Store.InventoryService.Repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loaddata(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkucode("Iphone");
			inventory.setQuantity(55);

			Inventory inventory1= new Inventory();
			inventory.setSkucode("One Plus");
			inventory.setQuantity(50);


			Inventory inventory2= new Inventory();
			inventory2.setSkucode("MI");
			inventory2.setQuantity(500);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
			inventoryRepository.save(inventory2);
		};
	}
}
