package org.example.behavioralpaatterns.Interpretator.tokens;

public interface Expression {

    int interpret(Expression context);
}
