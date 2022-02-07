package com.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Item;
import com.model.Order;
import com.model.User;
import com.repository.OrderRepository;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu");
	private  LocalDate localDate = LocalDate.now();
	private String currentDate = dtf.format(localDate);
	
	private User user;
	
	public OrderController(User user) {
		this.user = user;
	}
	//previous orders
	public List<Order> getOrders(){
		return this.user.getOrdersList();
	}
	
	//create order
	public void confirmOrder(List<Item> itemList) {
			Order newOrder = new Order(this.user.getUserId(), itemList, calculateOrderTotal(itemList));
			newOrder.setOrderId(UUID.randomUUID().toString());
			newOrder.setOrderDate(currentDate);
			orderRepository.save(newOrder);
	}
	

	@GetMapping("/{orderId}")
	public Optional<Order> getOrder(@PathVariable final String orderId){
		return orderRepository.findById(orderId);
	}
	
	private BigDecimal calculateOrderTotal(List<Item>itemList) {
		BigDecimal orderTotal = null;
		for(Item item: itemList) {
				orderTotal = orderTotal.add(item.getItemPrice());
		}
		return orderTotal;
	}
	
	
	//test methods
	@PostMapping("/add")
	public void addOrder(@RequestBody final Order order) {
			order.setOrderId(UUID.randomUUID().toString());
			order.setOrderDate(currentDate);
			orderRepository.save(order);
	}
	
}
