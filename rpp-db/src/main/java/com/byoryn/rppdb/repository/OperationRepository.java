package com.byoryn.rppdb.repository;

import com.byoryn.rppdb.entity.OperationRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<OperationRecord, Integer> {
}
