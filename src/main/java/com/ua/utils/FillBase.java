package com.ua.utils;

import com.ua.entity.OrderStatus;
import com.ua.entity.User;
import com.ua.entity.enums.Role;
import com.ua.service.OrderStatusService;
import com.ua.service.UserService;

public final class FillBase {

	final static String email = "admin@gmail.com";
	
	public static void fillBase(UserService userService, OrderStatusService orderStatusService) {
		
		if (userService.findByEmail(email) == null) {
			
			User user = new User();
			user.setFirstName("admin");
			user.setLastName("adminov");
			user.setRole(Role.ROLE_ADMIN);
			user.setPassword("1Qwerty");
			user.setEmail(email);
			userService.save(user);
			
			fillAndSaveOrder(orderStatusService, "CREATED");
			fillAndSaveOrder(orderStatusService, "CONFIRMED");
			fillAndSaveOrder(orderStatusService, "RETURNED");
			fillAndSaveOrder(orderStatusService, "CANCELED");
			
		}
	}
	
	public static void fillAndSaveOrder( OrderStatusService orderStatusService, String name) {
		OrderStatus orderStatus = new OrderStatus();
		orderStatus.setTitle(name);
		orderStatusService.saveOrderStatus(orderStatus);
	}
	
	
}
