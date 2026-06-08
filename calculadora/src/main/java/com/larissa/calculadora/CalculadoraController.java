package com.larissa.calculadora;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @RequestMapping(value = "/somar", method = {RequestMethod.GET, RequestMethod.POST})
    public String somar(@RequestParam double a, @RequestParam double b) {
        double resultado = a + b;
        return "Resultado da adição: " + resultado;
    }

    @RequestMapping(value = "/subtrair", method = {RequestMethod.GET, RequestMethod.POST})
    public String subtrair(@RequestParam double a, @RequestParam double b) {
        double resultado = a - b;
        return "Resultado da subtração: " + resultado;
    }

    @RequestMapping(value = "/multiplicar", method = {RequestMethod.GET, RequestMethod.POST})
    public String multiplicar(@RequestParam double a, @RequestParam double b) {
        double resultado = a * b;
        return "Resultado da multiplicação: " + resultado;
    }

    @RequestMapping(value = "/dividir", method = {RequestMethod.GET, RequestMethod.POST})
    public String dividir(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            return "Erro: divisão por zero não é permitida!";
        }
        double resultado = a / b;
        return "Resultado da divisão: " + resultado;
    }

    @RequestMapping(value = "/potencia", method = {RequestMethod.GET, RequestMethod.POST})
    public String potencia(@RequestParam double base, @RequestParam double expoente) {
        double resultado = Math.pow(base, expoente);
        return "Resultado da potência: " + resultado;
    }
}
