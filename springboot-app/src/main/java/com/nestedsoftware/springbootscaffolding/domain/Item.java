package com.nestedsoftware.springbootscaffolding.domain;

public class Item {
    private final Long id;
    private final String itemName;

    public Item(Long id, String itemName) {
        this.id = id;
        this.itemName = itemName;
    }

    public Long getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }
}
