package com.carritocompras.controller;

import com.carritocompras.model.Venta;
import com.carritocompras.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @PostMapping
    public Venta guardarVenta(@RequestBody Venta venta) {
        return ventaService.guardarVenta(venta);
    }

    @GetMapping("/{id}")
    public Venta obtenerVentaPorId(@PathVariable Long id) {
        return ventaService.obtenerVentaPorId(id);
    }

    @GetMapping("/fecha/{fecha}")
    public List<Venta> obtenerVentasPorFecha(@PathVariable Date fecha) {
        return ventaService.obtenerVentasPorFecha(fecha);
    }

    // Otros métodos según los requisitos

}
