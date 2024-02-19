package org.ejercicio1.currencyconverterservice.service.impl;

import org.ejercicio1.currencyconverterservice.service.ICurrencyConverterService;
import org.springframework.stereotype.Service;

@Service
public class CurrencyConverterService implements ICurrencyConverterService {

    @Override
    public Double getMoney(String arg, String us) {
        return 104.76;
    }
}
