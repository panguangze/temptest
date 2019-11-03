package com.byoryn.rppdb.repository;

import com.byoryn.rppdb.entity.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<SampleEntity, Integer> {
}
