package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitService {
    Fruit getById(Long id);
    Fruit save(Fruit fruit);
    Fruit delete(Long id);
    List<Fruit> getByPriceDesc();
    List<Fruit> getByPriceAsc();
    List<Fruit> searchByName(String word);

}
