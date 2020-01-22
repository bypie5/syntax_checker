package syntax_checker;

public abstract class Binder {

    SymbolTable myItems;

    public boolean addSymbol(Symbol key, Binder b) {
        if (myItems.get(key) == null) {
            myItems.put(key, b);
            return true;
        }
        return false;
    }
}
