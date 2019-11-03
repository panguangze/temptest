package com.byoryn.rppdb.repository;

import com.byoryn.rppdb.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
}
