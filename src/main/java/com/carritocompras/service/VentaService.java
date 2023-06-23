package com.carritocompras.service;

import com.carritocompras.model.Venta;

import java.util.Date;
import java.util.List;

public interface VentaService {

    Venta guardarVenta(Venta venta);

    Venta obtenerVentaPorId(Long id);

    List<Venta> obtenerVentasPorFecha(Date fecha);

    // Otros métodos según los requisitos

}
