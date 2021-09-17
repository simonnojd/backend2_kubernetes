package com.example.backend2_kubernetes.application;

import com.example.backend2_kubernetes.domain.HelloResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloService {

    public HelloResponse sayHello() {
        return new HelloResponse("Hello, World!");
    }

}
