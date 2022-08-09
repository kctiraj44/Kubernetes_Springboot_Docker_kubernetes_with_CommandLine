package com.example.springboot_docker_kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerKubernetesApplication {

    @GetMapping("/get")
    public String getHello(){
        return "*-------This is my First Kubernetes application--------*";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDockerKubernetesApplication.class, args);
    }

}
