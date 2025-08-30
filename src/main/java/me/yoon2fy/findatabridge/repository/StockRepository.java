package me.yoon2fy.findatabridge.repository;

import me.yoon2fy.findatabridge.domain.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}