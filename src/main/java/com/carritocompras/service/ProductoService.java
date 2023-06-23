package com.carritocompras.service;

import java.util.List;
import com.carritocompras.model.Producto;

public interface ProductoService {

    List<Producto> obtenerTodosLosProductos();

    Producto guardarProducto(Producto producto);

    Producto obtenerProductoPorId(Long id);

    void eliminarProducto(Long id);

    // Otros métodos según los requisitos

}
