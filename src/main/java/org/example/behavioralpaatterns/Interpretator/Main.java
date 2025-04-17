package org.example.behavioralpaatterns.Interpretator;


import org.example.behavioralpaatterns.Interpretator.tokens.Evaluate;
import org.example.behavioralpaatterns.Interpretator.tokens.Expression;

public class Main {
    public static void main(String[] args) {
        String expression = "1+6+3-72";
        Expression evaluator = new Evaluate(expression);
        System.out.println(evaluator.interpret(evaluator));
    }
}
