package syntax_checker;

public abstract class Binder {

    SymbolTable myItems;

    public abstract boolean addSymbol(Symbol key, Binder b);
}
