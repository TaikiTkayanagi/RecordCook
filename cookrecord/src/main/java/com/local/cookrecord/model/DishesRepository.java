package com.local.cookrecord.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DishesRepository extends JpaRepository<Dishes, Integer> {
}
