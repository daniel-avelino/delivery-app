package com.delivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
