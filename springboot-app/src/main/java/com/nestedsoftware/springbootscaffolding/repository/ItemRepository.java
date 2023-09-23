package com.nestedsoftware.springbootscaffolding.repository;

import com.nestedsoftware.springbootscaffolding.domain.Item;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
  List<Item> findAll();
}