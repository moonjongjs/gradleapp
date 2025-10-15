package com.moonjong.gradleapp.repository;

import com.moonjong.gradleapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}