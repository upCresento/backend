package org.upcresento.shopper.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.upcresento.shopper.backend.entity.Item;
import org.upcresento.shopper.backend.repository.ItemReopsitory;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemReopsitory itemReopsitory;

    @GetMapping("/api/items")
    public List<Item> getItems() {

        return itemReopsitory.findAll();
    }
}
