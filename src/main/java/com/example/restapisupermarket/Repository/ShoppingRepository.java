package com.example.restapisupermarket.Repository;

import com.example.restapisupermarket.Model.Shopping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingRepository extends JpaRepository<Shopping, Long> {
}
