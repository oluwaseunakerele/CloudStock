package com.cloudstock.controller;

import com.cloudstock.model.Item;
import com.cloudstock.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/items")
public class ItemController {

    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @GetMapping
    public String listItems(Model model) {
        model.addAttribute("items", service.getAllItems());
        return "items"; // thymeleaf template: src/main/resources/templates/items.html
    }

    @GetMapping("/add")
    public String addItemForm(Model model) {
        model.addAttribute("item", new Item());
        return "item_form"; // template: item_form.html
    }

    @PostMapping("/save")
    public String saveItem(@ModelAttribute @Valid Item item,
                           BindingResult errors) {
        if (errors.hasErrors()) {
            return "item_form";
        }
        service.saveItem(item);
        return "redirect:/items";
    }

    @GetMapping("/edit/{id}")
    public String editItem(@PathVariable Long id, Model model) {
        model.addAttribute("item", service.getItemById(id));
        return "item_form";
    }

    @GetMapping("/delete/{id}")
    public String deleteItem(@PathVariable Long id) {
        service.deleteItem(id);
        return "redirect:/items";
    }

    @GetMapping("/view/{id}")
    public String viewItem(@PathVariable Long id, Model model) {
        model.addAttribute("item", service.getItemById(id));
        return "item_details"; // template: item_details.html
    }
}
