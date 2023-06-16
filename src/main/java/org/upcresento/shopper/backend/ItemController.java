package org.upcresento.shopper.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {

    @GetMapping("/api/items")
    public List<String> getItems() {
        List<String> items = new ArrayList<>();
        items.add("apple");
        items.add("banana");
        items.add("carrot");
        return items;
    }
}
