package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Item;
import com.repository.ItemRepository;

@RestController
@RequestMapping("/items")
public class HomeController {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@PostMapping("/add")
	public  void addItem(@RequestBody final Item item){
		itemRepository.save(item);
	}
	
	@GetMapping("/all")
	public List<Item> getAll(){
		return itemRepository.findAll();
	}
	
	@GetMapping("/{itemId}")
	public Optional<Item> findById(@PathVariable final String itemId) {
		return itemRepository.findById(itemId);
	}
	

}
