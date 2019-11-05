package behavioral.interpreter.improved;


import java.util.Map;

interface Expression {
    int interpret(Map<String, Expression> variables);
}