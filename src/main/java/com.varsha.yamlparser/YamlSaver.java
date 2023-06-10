package com.varsha.yamlparser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.varsha.yamlparser")
public class YamlSaver {
    public static void main(String[] args) {
        SpringApplication.run(YamlSaver.class, args);
    }
}
