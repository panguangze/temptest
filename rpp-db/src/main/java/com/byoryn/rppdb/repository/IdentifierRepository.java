package com.byoryn.rppdb.repository;

import com.byoryn.rppdb.entity.IdentifierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentifierRepository extends JpaRepository<IdentifierEntity, Integer> {
}
