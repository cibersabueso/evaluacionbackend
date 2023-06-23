package com.carritocompras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.carritocompras.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
