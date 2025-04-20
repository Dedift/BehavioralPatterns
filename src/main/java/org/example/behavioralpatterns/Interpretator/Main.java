package org.example.behavioralpatterns.Interpretator;


import org.example.behavioralpatterns.Interpretator.tokens.Evaluate;
import org.example.behavioralpatterns.Interpretator.tokens.Expression;

public class Main {
    public static void main(String[] args) {
        String expression = "1+6+3-72";
        Expression evaluator = new Evaluate(expression);
        System.out.println(evaluator.interpret(evaluator));
    }
}
