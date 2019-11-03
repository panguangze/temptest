package com.byoryn.rppdb.repository;

import com.byoryn.rppdb.entity.BuyerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepository extends JpaRepository<BuyerEntity, Integer> {
}
