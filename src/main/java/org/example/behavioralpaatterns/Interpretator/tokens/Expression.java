package org.example.behavioralpatterns.Interpretator.tokens;

public interface Expression {

    int interpret(Expression context);
}
