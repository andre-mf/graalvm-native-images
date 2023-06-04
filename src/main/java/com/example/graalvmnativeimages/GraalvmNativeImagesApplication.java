package com.example.graalvmnativeimages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class GraalvmNativeImagesApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraalvmNativeImagesApplication.class, args);
    }

    @GetMapping("/")
    String hello() throws UnknownHostException {
        return "Hello, World! from " + InetAddress.getLocalHost().getHostName();
    }

}
