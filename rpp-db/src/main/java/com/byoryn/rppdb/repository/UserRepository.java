package com.byoryn.rppdb.repository;

import com.byoryn.rppdb.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
