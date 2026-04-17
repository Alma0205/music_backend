package com.palmaproject.repository;

import com.palmaproject.model.Discografica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscograficaRepository extends JpaRepository<Discografica, Long> {
}