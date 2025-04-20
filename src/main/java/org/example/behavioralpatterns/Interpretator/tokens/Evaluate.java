package org.example.behavioralpatterns.Interpretator.tokens;


import java.util.Stack;

public class Evaluate implements Expression {
    Expression evaluate;

    public Evaluate(String expression) {
        Stack<Expression> expressions = new Stack<>();
        String[] tokens = expression.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");

        expressions.push(new Number(Integer.parseInt(tokens[0])));

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int number = Integer.parseInt(tokens[i+1]);

            if (operator.equals("+")) {
                expressions.push(new Plus(expressions.pop(), new Number(number)));
            } else if (operator.equals("-")) {
                expressions.push(new Minus(expressions.pop(), new Number(number)));
            }
        }

        evaluate = expressions.pop();
    }

    @Override
    public int interpret(Expression context) {
        return evaluate.interpret(context);
    }
}