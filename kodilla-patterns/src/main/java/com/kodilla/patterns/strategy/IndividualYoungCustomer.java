package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AggresivePredictor;

public final class IndividualYoungCustomer extends User {

    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggresivePredictor();
    }
}