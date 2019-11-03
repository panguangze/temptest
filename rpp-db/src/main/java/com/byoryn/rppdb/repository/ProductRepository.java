package com.byoryn.rppdb.repository;

import com.byoryn.rppdb.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
