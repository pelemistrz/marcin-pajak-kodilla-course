package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.BuyPredictor;

public sealed class User permits
    CorporateCustomer,IndividualCustomer,IndividualYoungCustomer{

    private final String name;
    protected BuyPredictor buyPredictor;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String predict(){
        return buyPredictor.predictWhatToBuy();
    }
    public void setBuyingStrategy(BuyPredictor buyPredictor) {
        this.buyPredictor = buyPredictor;
    }
}