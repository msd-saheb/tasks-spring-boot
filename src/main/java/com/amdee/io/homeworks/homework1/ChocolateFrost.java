package com.amdee.io.homeworks.homework1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "cake.flavor.frost", havingValue ="Chocolate")
public class ChocolateFrost implements Frosting {

    @Override
    public void getFrostingType() {
        System.out.println("ChocolateFrost");
    }
}
