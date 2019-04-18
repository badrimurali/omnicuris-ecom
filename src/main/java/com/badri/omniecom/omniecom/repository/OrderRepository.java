package com.badri.omniecom.omniecom.repository;


import com.badri.omniecom.omniecom.orders.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByCustomerId(@Param("customerId") Long customerId);
}
