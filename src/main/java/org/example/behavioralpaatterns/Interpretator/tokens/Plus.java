package org.example.behavioralpaatterns.Interpretator.tokens;

public class Plus implements Expression {
    Expression expressionLeft;
    Expression expressionRight;

    public Plus(Expression expressionLeft, Expression expressionRight) {
        this.expressionLeft = expressionLeft;
        this.expressionRight = expressionRight;
    }

    @Override
    public int interpret(Expression context) {
        return expressionLeft.interpret(context) + expressionRight.interpret(context);
    }
}
