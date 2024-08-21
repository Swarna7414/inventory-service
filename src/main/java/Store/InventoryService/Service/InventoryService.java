package Store.InventoryService.Service;

import Store.InventoryService.Repository.InventoryRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Transactional(readOnly=true)
    public boolean isinstocl(String skucode){
        return inventoryRepository.findByskucode(skucode).isPresent();
    }
}
