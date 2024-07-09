package com.amdee.io.homeworks.homework2.configs;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DepartmentConfigurations {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
