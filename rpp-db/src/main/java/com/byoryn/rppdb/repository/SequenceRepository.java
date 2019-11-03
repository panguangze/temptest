package com.byoryn.rppdb.repository;

import com.byoryn.rppdb.entity.SequenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SequenceRepository extends JpaRepository<SequenceEntity, Integer> {
}
