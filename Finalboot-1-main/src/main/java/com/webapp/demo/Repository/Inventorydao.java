package com.webapp.demo.Repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.webapp.demo.Model.Inventory;
import com.webapp.demo.Model.Sale;

public interface Inventorydao extends JpaRepository<Inventory, Integer> {
    @Modifying
    @Transactional
    @Query("delete from Inventory i where i.location=?1")
    void deletebyLocation(String location);

    @Transactional
    @Modifying
    void deleteByDateBefore(LocalDate date);

    Inventory findByProductId(int productId);

}
