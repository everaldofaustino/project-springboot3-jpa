package com.everaldo.course.repositories;

import com.everaldo.course.entities.Order;
import com.everaldo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
