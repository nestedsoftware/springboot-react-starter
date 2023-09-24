package com.nestedsoftware.springbootscaffolding;

import com.nestedsoftware.springbootscaffolding.ItemRepository;
import com.nestedsoftware.springbootscaffolding.Item;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SimpleRestController {
    private final ItemRepository repository;

    SimpleRestController(ItemRepository repository) {
        this.repository = repository;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/items")
    List<Item> all() {
        List<Item> items = repository.findAll();
        return items;
    }
}
