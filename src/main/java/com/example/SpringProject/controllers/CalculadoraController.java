package com.example.SpringProject.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

    // criar dois métodos
    // 1- somar dois numeros e jogar na web
    // 2- subtrair dois numeros e jogar na web


    @GetMapping(path = "/somar/{a}/{b}")
    public int soma(@PathVariable int a, @PathVariable int b) {
        int soma = a + b;
        return soma;
    }

    @GetMapping("/subtrair")
    public int subtrair(@RequestParam(name = "a") int a,
                        @RequestParam(name = "b") int b) {
        int subtracao = a - b;
        return subtracao;
    }


}
