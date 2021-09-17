package com.example.backend2_kubernetes.presentation;

import com.example.backend2_kubernetes.application.HelloService;
import com.example.backend2_kubernetes.domain.HelloResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldResource {

    private final HelloService helloService;

    public HelloWorldResource(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public ResponseEntity<HelloResponse> hello() {
        HelloResponse helloResponse = helloService.sayHello();
        return ResponseEntity.ok(helloResponse);
    }
}
