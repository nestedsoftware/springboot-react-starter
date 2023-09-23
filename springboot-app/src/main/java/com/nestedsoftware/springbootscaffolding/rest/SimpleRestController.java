package com.nestedsoftware.springbootscaffolding.rest;

import com.nestedsoftware.springbootscaffolding.domain.Item;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SimpleRestController {
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/items")
    List<Item> all() {
        return Arrays.asList(new Item(1L, "coffee"), new Item(2L, "tea"), new Item(3L, "cookies"));
    }
}
