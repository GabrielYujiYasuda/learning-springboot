package com.example.SpringProject.controllers;
import com.example.SpringProject.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente () {
        return new Cliente(28, "Pedro", "123.456.678-00");
    }

    @GetMapping(path = "/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) {
        return new Cliente(id, "Maria", "987.654.432-11");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new Cliente(id, "Gabriel Yasuda", "999-777-555-12");
    }

}
