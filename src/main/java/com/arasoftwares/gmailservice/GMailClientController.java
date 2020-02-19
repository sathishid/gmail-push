package com.arasoftwares.gmailservice;

import java.util.Base64;

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
        System.out.println("say hi method called");
        return "<html><head><meta name='google-site-verification' content='yOnmr52jMDmWBnHCu0oMMy-B4CqJc8bug__iKNgzYFQ' />"
               +"<title>Gmail-Push Notification </title>"
               +"</head><body><h1>Hello World!</h1>"
               +"<p>Welcome to the Web App</body></html>";
    }

    @PostMapping("push")
    public ResponseEntity<?> recieveMail(@RequestBody String body) {
        String encodedString = Base64.getEncoder().withoutPadding().encodeToString(body.getBytes());
        System.out.println(encodedString);
        return ResponseEntity.noContent().build();
    }
}
