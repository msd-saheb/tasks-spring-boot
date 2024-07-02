package com.amdee.io.homeworks.homework1;

import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    private final Frosting frosting;

    private final Syrup syrup;

    public CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake(){
        frosting.getFrostingType();
        syrup.getSyrupType();
    }
}
