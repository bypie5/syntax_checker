package syntax_checker;

public class Binder {
    public Symbol symbol;
    public Object binding;

    public Binder(Symbol s, Object b) {
        symbol = s; binding = b;
    }
}
