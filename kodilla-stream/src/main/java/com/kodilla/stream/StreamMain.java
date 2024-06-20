package com.kodilla.stream;

import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionCalculator;

public class StreamMain {

    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println("ExpressionExecutor");
        expressionExecutor.executeExpression(10,4, (a,b)-> a+b);
        expressionExecutor.executeExpression(10,4, (a,b)-> a-b);
        expressionExecutor.executeExpression(10,4, (a,b)-> a*b);
        expressionExecutor.executeExpression(10,4, (a,b)-> a/b);

        System.out.println("ExpressionExecutor");
        expressionExecutor.executeExpression(10,4, FunctionCalculator::addAToB);
        expressionExecutor.executeExpression(10,4, FunctionCalculator::multiplyAByB);
        expressionExecutor.executeExpression(10,4, FunctionCalculator::subBFromA);
        expressionExecutor.executeExpression(10,4, FunctionCalculator::divideAByB);

    }
}