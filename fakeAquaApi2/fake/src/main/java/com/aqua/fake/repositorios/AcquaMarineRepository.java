package com.aqua.fake.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aqua.fake.entidades.AcquaMarine;

@Repository
public interface AcquaMarineRepository extends JpaRepository<AcquaMarine, Long> {
    
}
