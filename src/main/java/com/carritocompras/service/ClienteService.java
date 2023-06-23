package com.carritocompras.service;

import java.util.List;
import com.carritocompras.model.Cliente;

public interface ClienteService {

    List<Cliente> obtenerTodosLosClientes();

    Cliente guardarCliente(Cliente cliente);

    Cliente obtenerClientePorId(Long id);

    // Otros métodos según los requisitos

}
