package org.example.behavioralpaatterns.Interpretator.tokens;

public class Number implements Expression {
    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Expression context) {
        return number;
    }
}
