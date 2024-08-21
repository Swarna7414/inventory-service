package Store.InventoryService.Controller;

import Store.InventoryService.Service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController{

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/{skucode}")
    @ResponseStatus(HttpStatus.CREATED)
    public Boolean isinstock(@PathVariable("skucode") String skucode){
        return inventoryService.isinstocl(skucode);
    }
}
