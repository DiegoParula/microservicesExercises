package com.example.ConsumerService.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RestController
public class DevController {


        @Value("${denominaciones_billete}")
        private String message;


        @GetMapping("/service")
        public String getMessage() {

            return message;
        }

}
