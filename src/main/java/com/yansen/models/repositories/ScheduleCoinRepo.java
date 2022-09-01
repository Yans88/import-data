package com.yansen.models.repositories;

import com.yansen.models.entities.ScheduleCoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleCoinRepo extends JpaRepository<ScheduleCoin, Long> {
}
