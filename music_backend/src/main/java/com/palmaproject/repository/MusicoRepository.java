package com.palmaproject.repository;

import com.palmaproject.model.Musico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicoRepository extends JpaRepository<Musico, Long> {
}