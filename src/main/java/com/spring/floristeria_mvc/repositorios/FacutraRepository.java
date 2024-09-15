package com.spring.floristeria_mvc.repositorios;

import com.spring.floristeria_mvc.entidades.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacutraRepository extends JpaRepository<Factura, Long> {
}
