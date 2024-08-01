package com.kodilla.patterns.strategy.predictors;

public class AggresivePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}