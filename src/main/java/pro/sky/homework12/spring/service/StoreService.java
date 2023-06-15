package pro.sky.homework12.spring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class StoreService {

    private final List<Integer> storage = new ArrayList<>();

    public void addProduct(List<Integer> products){
        storage.addAll(products);
    }

    public List<Integer> getProducts(){
        return Collections.unmodifiableList(storage);
    }
}