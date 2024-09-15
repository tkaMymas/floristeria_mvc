package com.spring.floristeria_mvc.repositorios;

import com.spring.floristeria_mvc.entidades.Flor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlorRepository extends JpaRepository<Flor, Long> {
}
