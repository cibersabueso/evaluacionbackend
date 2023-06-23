package com.carritocompras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.carritocompras.model.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long> {

}
