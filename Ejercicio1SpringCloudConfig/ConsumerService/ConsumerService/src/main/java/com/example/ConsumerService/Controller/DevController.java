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

/*
        @Value("${message}")
        private String message;
        @Value("${global-message}")
        private String globalMessage;

        @GetMapping("/service")
        public Map<String,String> message() {
            Map<String,String> response = new HashMap<>();
            response.put("message", message);
            response.put("global-message", globalMessage);
            return response;
        }
*/
}
