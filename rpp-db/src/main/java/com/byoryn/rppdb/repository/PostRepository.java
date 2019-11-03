package com.byoryn.rppdb.repository;

import com.byoryn.rppdb.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Integer> {
}
