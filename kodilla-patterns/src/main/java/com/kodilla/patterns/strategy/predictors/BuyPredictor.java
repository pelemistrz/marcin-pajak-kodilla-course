package com.kodilla.patterns.strategy.predictors;

public sealed interface BuyPredictor
    permits AggresivePredictor,ConservativePredictor,BalancedPredictor
{
    String predictWhatToBuy();
}
