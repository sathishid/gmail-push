package com.arasoftwares.gmailservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GMailClientController {

    @GetMapping
    public String sayHi() {
        return "Hi";
    }

    @PostMapping("push")
    public ResponseEntity<?> recieveMail(@RequestBody String body) {
        return ResponseEntity.noContent().build();
    }
}