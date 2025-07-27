package com.cloudstock.service;

import com.cloudstock.model.Item;
import com.cloudstock.repository.ItemRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemService {

    private final ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public List<Item> getAllItems() {
        return repository.findAll();
    }

    public Item saveItem(Item item) {
        return repository.save(item);
    }

    public void deleteItem(Long id) {
        repository.deleteById(id);
    }

    // ✅ This is the method your controller needs
    public Item getItemById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
