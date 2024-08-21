package Store.InventoryService.Repository;

import Store.InventoryService.Model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    public Optional<Inventory> findByskucode(String skucode);
}
