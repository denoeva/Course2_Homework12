package pro.sky.homework12.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework12.spring.service.StoreService;

import java.util.List;
@RestController
@RequestMapping("/store/order")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping(path = "/add")
    public void addProduct(@RequestParam("ID") List<Integer> products){
        storeService.addProduct(products);
    }

    @GetMapping(path = "/get")
    public List<Integer> getProducts(){
        return storeService.getProducts();
    }
}