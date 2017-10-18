package com.situ.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.mall.dao.OrderDao;
import com.situ.mall.pojo.Order;
import com.situ.mall.pojo.OrderItem;
import com.situ.mall.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderDao orderDao;
	@Override
	public Order findOrderByUserId(Integer userId) {
		return orderDao.findOrderByUserId(userId);
	}
	@Override
	public void addOrder(Order order) {
		orderDao.addOrder(order);
	}
	@Override
	public List<Order> findAllOrderByUserId(int userId) {
		return orderDao.findAllOrderByUserId(userId);
	}
	@Override
	public List<String> findOrderNo(int userId) {
		return orderDao.findOrderNo(userId);
	}
	@Override
	public List<OrderItem> findOrderItemByOrderNo(String orderId) {
		return orderDao.findOrderItemByOrderNo(orderId);
	}
	@Override
	public List<OrderItem> findAllOrder() {
		return orderDao.findAllOrder();
	}
	@Override
	public Order findOrderByOrderNo(String order_no) {
		return orderDao.findOrderByOrderNo(order_no);
	}
	@Override
	public List<Order> findOrder() {
		return orderDao.findOrder();
	}

}