package com.spring.floristeria_mvc.repositorios;

import com.spring.floristeria_mvc.entidades.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long> {
}
