package org.ejercicio1.currencyconverterservice.controller;

import org.ejercicio1.currencyconverterservice.service.ICurrencyConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConverterController {

    private ICurrencyConverterService currencyConverterService;

    @Autowired
    public CurrencyConverterController(ICurrencyConverterService currencyConverterService) {
        this.currencyConverterService = currencyConverterService;
    }

    @GetMapping("/converter")
    public Double getCurrencyConverter(@RequestParam String arg, @RequestParam String us){
        return currencyConverterService.getMoney(arg, us);
    }
}
