package com.byoryn.rppdb.repository;

import com.byoryn.rppdb.entity.ShopEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<ShopEntity, Integer> {
}
