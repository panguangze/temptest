package com.byoryn.rppdb.repository;

import com.byoryn.rppdb.entity.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<ReportEntity, Integer> {
}
