package chapter30.interpreter;

import javax.naming.Context;

public interface Expression {
    public boolean interpret(String context);
}
